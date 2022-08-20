package ru.virusofgod.reloadedconstructors;

public class Employee extends Person{
protected String post;



    public Employee(String lastName, String firstName, char gender, String post) {
        super(lastName, firstName, gender);
        this.post = post;
    }

    @Override
    public String toString() {
        return "Employee{" +

                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender + '\'' +
                "post='" + post +
                '}';
    }

    public void tellMeWhoAreYou(){
        System.out.println("Hello I am Employee, and my class is " + this.getClass());
    }
}

