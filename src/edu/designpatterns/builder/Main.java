package edu.designpatterns.builder;

public class Main {

    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("edu.designpatterns.factory.Person")
                .addField("name", "String")
                .addField("age", "int");
        System.out.println(cb);
    }
}
