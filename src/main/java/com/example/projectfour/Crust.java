package com.example.projectfour;

public enum Crust {
    DEEPDISH("deepDish"),
    PAN("pan"),
    STUFFED("stuffed"),
    BROOKLYN("brooklyn"),
    THIN("thin"),
    HEADTOSSED("headtossed");

    private String crustName;

    Crust(String crustName){
        this.crustName = crustName;
    }
}
