package edu.designpatterns.factory;

public class Person
{
    public int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Person{id=%d,name=%s", id, name);
    }
}

