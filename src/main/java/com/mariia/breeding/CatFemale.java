package com.mariia.breeding;

import java.util.ArrayList;
import java.util.List;
import static com.mariia.breeding.Sex.FEMALE;

public class CatFemale extends BreedingCat{

    private List<BreedingCat> children = new ArrayList<>();

    public CatFemale(CatFemale mother, CatMale father) {
        super(FEMALE, mother, father);
    }

    public List<BreedingCat> breed(CatMale catMale) {
        var list = new ArrayList<BreedingCat>();
        list.add(new CatMale(this, catMale));
        list.add(new CatMale(this, catMale));
        list.add(new CatMale(this, catMale));
        list.add(new CatFemale(this, catMale));
        list.add(new CatFemale(this, catMale));

        children.addAll(list);

        return list;
    }

    public List<BreedingCat> getChildren() {
        return children;
    }
}



