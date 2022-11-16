package com.example.projectfour;

public enum Topping {
    SAUSAGE("sausage"),
    PEPPERONI("pepperoni"),
    GREENPEPPER("greenpepper"),
    ONION("onion"),
    MUSHROOM("mushroom"),
    BBQCHICKEN("bbqChicken"),
    PROVOLONE("provolone"),
    CHEDDAR("cheddar"),
    BEEF("beef"),
    HAM("ham");

    private String toppingName;

    Topping(String toppingName){
        this.toppingName = toppingName;
    }

    private Topping[] getPresetToppings(){
        return Topping.values();
    }

}
