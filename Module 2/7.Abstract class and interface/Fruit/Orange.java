package Fruit;

import EdibleFruit.EdibleFruit;

public class Orange extends Fruit implements EdibleFruit {
    @Override
    public String HowToEat(){
        return "Orange could be made juice";
    }
    @Override
    public String WhatColor() {
        return "Orange or green";
    }
}
