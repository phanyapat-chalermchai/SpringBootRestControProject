package com.phanyapat.crudRestProject.entity;



public class Student {

    //define fields
    private int id;

    private String firstName;

    private String lastName;



    //define constructors
    public Student(){

    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //define getters/setters

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



    //define toString() method
    @Override
    public String toString() {
        return "Student{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
