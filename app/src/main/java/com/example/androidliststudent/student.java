package com.example.androidliststudent;

public class student {
    private String name;
    private int age;
    private String hometown;

    public student(String name, int age, String hometown) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }
}
