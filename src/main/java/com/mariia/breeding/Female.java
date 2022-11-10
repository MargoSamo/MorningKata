package com.mariia.breeding;

import java.util.ArrayList;
import java.util.List;
import static com.mariia.breeding.Sex.FEMALE;

public class Female extends BreedingCat{

    private List<BreedingCat> cats = new ArrayList<>();

    public Female() {
        super(FEMALE);
    }

    public List<BreedingCat> breed (Male male) {
        var list = new ArrayList<BreedingCat>();
        list.add(new Male());
        list.add(new Male());
        list.add(new Male());
        list.add(new Female());
        list.add(new Female());

        return list;
    }
}



