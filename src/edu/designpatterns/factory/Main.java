package edu.designpatterns.factory;

public class Main {

    public static void main(String[] args) {
        PersonFactory pf1 = new PersonFactory();
        PersonFactory pf2 = new PersonFactory();
        Person john = pf1.createPerson("John");
        Person jack = pf1.createPerson("Jack");
        Person joe = pf2.createPerson("Joe");

        System.out.println(john);
        System.out.println(jack);
        System.out.println(joe);
    }
}
