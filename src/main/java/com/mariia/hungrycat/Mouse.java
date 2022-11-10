package com.mariia.hungrycat;

public class Mouse {
    private String mouseName;
    private int mouseWeight;

    public Mouse(String mouseName, int mouseWeight) {
        this.mouseName = mouseName;
        this.mouseWeight = mouseWeight;
    }

    public String getMouseName() {
        return mouseName;
    }

    public void setMouseName(String mouseName) {
        this.mouseName = mouseName;
    }

    public int getMouseWeight() {
        return mouseWeight;
    }

    public void setMouseWeight(int mouseWeight) {
        this.mouseWeight = mouseWeight;
    }
}
