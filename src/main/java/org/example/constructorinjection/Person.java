package org.example.constructorinjection;

public class Person
{
    private int id;
    private String name;

    public Person(String name, int id){
        this.id =id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
