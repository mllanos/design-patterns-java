package edu.designpatterns.builder;

import java.util.ArrayList;

public class CodeBuilder {
    private String className;
    private ArrayList<String> fields;

    public CodeBuilder(String className) {
        this.className = className;
        this.fields = new ArrayList<>();
    }

    public CodeBuilder addField(String name, String type) {
        StringBuilder sb = new StringBuilder();
        fields.add(String.format("  public %s %s;", type, name));
        return this;
    }

    private String getFields() {
        return String.join(System.lineSeparator(), fields);
    }

    @Override
    public String toString() {
        String lineSeparator = System.lineSeparator();
        return String.format("public class %s%s{%s%s%s}",
                className,
                lineSeparator,
                lineSeparator,
                getFields(),
                fields.size() > 0 ? System.lineSeparator() : "");
    }
}