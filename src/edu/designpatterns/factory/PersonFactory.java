package edu.designpatterns.factory;

public class PersonFactory
{
    int count = 0;

    public Person createPerson(String name)
    {
        return new Person(count++, name);
    }
}
