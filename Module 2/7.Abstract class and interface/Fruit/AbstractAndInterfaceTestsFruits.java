package Fruit;

import EdibleFruit.EdibleFruit;
import com.sun.org.apache.xpath.internal.operations.Or;

public class AbstractAndInterfaceTestsFruits {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit:fruits) {
            fruit.HowToEat();
            System.out.println(fruit.HowToEat());
            if (fruit instanceof Orange) {
                EdibleFruit Orange = (Orange) fruit;
                System.out.println(Orange.WhatColor());
            }
            if (fruit instanceof Apple) {
                EdibleFruit Apple = (Apple) fruit;
                System.out.println(Apple.WhatColor());
            }
        }
    }
}
