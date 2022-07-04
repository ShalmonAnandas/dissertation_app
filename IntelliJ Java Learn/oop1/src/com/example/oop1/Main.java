package com.example.oop1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone11", 5, 8, 8);

        System.out.println(iPhone.getName());

        iPhone.playMusic("Shalala");
        iPhone.playMusic("Real men");

        Phone pixel = new Phone("pixel3", 16);
    }
}
