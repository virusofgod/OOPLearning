package ru.virusofgod.reloadedconstructors;

public class Person {
   protected String firstName;
    protected String lastName;
    protected char gender;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
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
