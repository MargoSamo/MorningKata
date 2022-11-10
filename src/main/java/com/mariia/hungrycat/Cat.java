package com.mariia.hungrycat;

public class Cat {
    private String catName;
    private int catWeight;

    public Cat(String catName, int catWeight) {
        this.catName = catName;
        this.catWeight = catWeight;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatWeight() {
        return catWeight;
    }

    public void setCatWeight(int catWeight) {
        this.catWeight = catWeight;
    }

    public void eatMouse(Mouse mouse) {
        if (mouse.getMouseName().isEmpty() || mouse.getMouseWeight() < 0 ) {
            System.out.println("Кошка не может поймать не существующую мышку!");
        } else {
            System.out.println("I am cat " + catName + " my weight " + catWeight + " I catch " + mouse.getMouseName() + " my weight now " + (catWeight + mouse.getMouseWeight()));
        }
    }
}
