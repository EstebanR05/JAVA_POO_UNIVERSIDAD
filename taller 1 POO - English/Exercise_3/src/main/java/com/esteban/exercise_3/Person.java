package com.esteban.exercise_3;

public class Person {

    private String name;
    private String lastName;
    private Boolean identification;
    private String typeSex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getIdentification() {
        return identification;
    }

    public void setIdentification(Boolean identification) {
        this.identification = identification;
    }

    public String getTypeSex() {
        return typeSex;
    }

    public void setTypeSex(String typeSex) {
        this.typeSex = typeSex;
    }

    public Boolean Adult() {
        if (this.identification == true) {
            return true;
        }
        return false;
    }

    public String Status() {
        return "name: " + this.name + " lasname: " + this.lastName + " identification " + this.identification + " typeSex: " + this.typeSex;
    }

    public Person() {
        this.name = "";
        this.lastName = "";
        this.identification = false;
        this.typeSex = "";
    }

    public Person(String name, String lastName, Boolean identification, String typeSex) {
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.typeSex = typeSex;
    }

    public Person(Person person) {
        this.name = person.name;
        this.lastName = person.lastName;
        this.identification = person.identification;
        this.typeSex = person.typeSex;
    }
}
