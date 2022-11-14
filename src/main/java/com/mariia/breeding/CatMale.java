package com.mariia.breeding;

import static com.mariia.breeding.Sex.MALE;

public class CatMale extends BreedingCat {

    public CatMale(CatFemale mother, CatMale father) {
        super(MALE, mother, father);
    }
}
