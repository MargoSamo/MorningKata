package com.mariia.breeding;

public abstract class BreedingCat {
    private Sex sex;

    public BreedingCat(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }
}
