package com.mariia.breeding;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerationCounterTest {

    @Test
    public void childShouldKnowHowManyGenerationFrontHim() {
        // Given
        var male = new CatMale(null, null);
        var female = new CatFemale(null, null);
        var cats = female.breed(male);
        var maleTwo = new CatMale(female, male);
        var femaleTwo = new CatFemale(female, male);
        var catsTwo = femaleTwo.breed(maleTwo);
        var maleThree = new CatMale(femaleTwo, maleTwo);
        var femaleThree = new CatFemale(femaleTwo, maleTwo);
        var catsThree = femaleThree.breed(maleThree);


        // When


        // Then

    }



}