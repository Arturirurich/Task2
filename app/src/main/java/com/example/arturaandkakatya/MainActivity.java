package com.example.arturaandkakatya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Cat firstCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstCat = new Cat(1, "Boris", "Maine Coon", "gray");
        firstCat.talk();

        Cat secondCat = new Cat(3, "Maurizio", "British", "orange");
        secondCat.talk();
        secondCat.breathe();

        Cat therdCat = new Cat();
        therdCat.age = 15;
        therdCat.name = "Bogdan";
        therdCat.poroda = "Sphinx";
        therdCat.colour = "pink";
        therdCat.numberOfLegs = 4;
        Log.i("numberOfLegs", String.valueOf(therdCat.numberOfLegs));
        therdCat.talk();

        Puma puma = new Puma();

        puma.isAlive = true;
        puma.name = "Leo";
        puma.breathe();
        puma.talk();
        Log.i("isAlive", String.valueOf(puma.isAlive));
        Log.i("breathe()", "My name is " + puma.name + " and " + puma.breathe());
    }
}