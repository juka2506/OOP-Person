package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(1);
        person.setHeight(1);
        person.setGender("Male");
        person.setComplexion("Fair");

        person.walk(false);
    }
}
