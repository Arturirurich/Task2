package com.example.arturaandkakatya;

import android.util.Log;

public class Cat extends Animal {
    int age;
    String name;
    String poroda;
    String colour;

    public Cat() {

    }

    public Cat(int age, String name, String poroda, String colour) {
        this.age = age;
        this.name = name;
        this.poroda = poroda;
        this.colour = colour;
    }

    public void talk() {
        Log.i("talk()", "Meow! My mame is " + name + ", and iam " + age + " years old. My poroda is " + poroda + " and i have " + colour + " colour. Meow!");
    }
}
