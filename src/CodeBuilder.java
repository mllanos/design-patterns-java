import java.util.ArrayList;

public class CodeBuilder
{
    private String className;
    private ArrayList<String> fields;

    public CodeBuilder(String className)
    {
        this.className = className;
        this.fields = new ArrayList<>();
    }

    public CodeBuilder addField(String name, String type)
    {
        StringBuilder sb = new StringBuilder();
        fields.add(sb
            .append("  public ")
            .append(type)
            .append(" ")
            .append(name)
            .append(";")
            .toString());
        return this;
    }

    private String getFields()
    {
        return String.join(System.lineSeparator(), fields);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        return sb
            .append("public class ")
            .append(className)
            .append(System.lineSeparator())
            .append("{")
            .append(System.lineSeparator())
            .append(getFields())
            .append(fields.size() > 0 ? System.lineSeparator() : "")
            .append("}")
            .toString();
    }
}