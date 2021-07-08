package com.company;

public class Person {

    private int height;
    private String gender;
    private String complexion;
    private int age;

    public Person(int height, String gender, String complexion, int age) {
        this.height = height;
        this.gender = gender;
        this.complexion = complexion;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void walk() {
        if (this.age > 1 && this.age < 90) {
            System.out.println("I walking");
        } else {
            System.out.println("Sorry, walking is too hard for me :(");
        }
    }

    public void talk() {
        System.out.println("Hello, Uchi!");
    }

    public void eat() {
        System.out.println("Yummy!");
    }

    public void run() {
        if (this.age > 2 && this.age < 60) {
            System.out.println("Let's run fastly!");
        }
        else {
            System.out.println("Sorry, running is too hard for me :(");
        }
    }
}
