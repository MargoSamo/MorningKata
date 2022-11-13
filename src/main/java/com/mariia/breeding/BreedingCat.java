package com.mariia.breeding;

public abstract class BreedingCat {
    private Sex sex;
    private CatFemale mother;
    private CatMale father;

    public BreedingCat(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public CatFemale getMother() {
        return mother;
    }

    public CatMale getFather() {
        return father;
    }
}
