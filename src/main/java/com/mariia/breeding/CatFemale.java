package com.mariia.breeding;

import java.util.ArrayList;
import java.util.List;
import static com.mariia.breeding.Sex.FEMALE;

public class CatFemale extends BreedingCat{

    private List<BreedingCat> cats = new ArrayList<>();

    public CatFemale() {
        super(FEMALE);
    }

    public List<BreedingCat> breed (CatMale catMale) {
        var list = new ArrayList<BreedingCat>();
        list.add(new CatMale());
        list.add(new CatMale());
        list.add(new CatMale());
        list.add(new CatFemale());
        list.add(new CatFemale());

        return list;
    }
}



