package com.mariia.breeding;

public abstract class BreedingCat {
    private Sex sex;
    private CatFemale mother;
    private CatMale father;

    public BreedingCat(Sex sex, CatFemale mother, CatMale father) {
        this.sex = sex;
        this.mother = mother;
        this.father = father;
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

    @Override
    public String toString() {
        return "BreedingCat{" +
                "sex=" + sex +
                ", mother=" + mother +
                ", father=" + father +
                '}';
    }
}
