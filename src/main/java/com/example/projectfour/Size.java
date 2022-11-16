package com.example.projectfour;

public enum Size {
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large");

    private String pizzaSize;

    Size(String pizzaSize){
        this.pizzaSize = pizzaSize;
    }
}
