package ru.virusofgod.reloadedconstructors;

public class Person {
    private String firstName;
    private String lastName;
    private char gender;

    public Person(){
        this("","", '-');

    }

    public Person(String lastName){
        this(lastName, "", '-' );

    }



    public Person(String lastName, String firstName, char gender){
        this(firstName, lastName);
        this.gender=gender;

    }

    public Person(String lastName, String firstName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
