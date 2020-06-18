package Fruit;


import EdibleFruit.EdibleFruit;

public class Apple extends Fruit implements EdibleFruit {
@Override
    public String HowToEat() {
    return "Apple could be sliced";
}
@Override
    public String WhatColor(){
    return "Green or red";
}
    }