package com.mariia.breeding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerationCounterTest {

    @Test
    public void childShouldKnowHowManyGenerationFrontHim() {
        // Given
        var male = new CatMale(null, null);
        var female = new CatFemale(null, null);
        var catsSecondGeneration = female.breed(male);

        var secondGenerationCatFemale = (CatFemale) catsSecondGeneration.stream().filter((breedingCat) -> breedingCat.getSex() == Sex.FEMALE).findFirst().get();
        var secondGenerationCatMale = (CatMale) catsSecondGeneration.stream().filter((breedingCat) -> breedingCat.getSex() == Sex.MALE).findFirst().get();
        var catsThreeGeneration = secondGenerationCatFemale.breed(secondGenerationCatMale);

        var threeGenerationCatFemale = (CatFemale) catsThreeGeneration.stream().filter((breedingCat) -> breedingCat.getSex() == Sex.FEMALE).findFirst().get();
        var threeGenerationCatMale = (CatMale) catsThreeGeneration.stream().filter((breedingCat) -> breedingCat.getSex() == Sex.MALE).findFirst().get();
        var catsFourGeneration = threeGenerationCatFemale.breed(threeGenerationCatMale);

        var generationCounter = new GenerationCounter();

        // When
        int numberOfGenerations = generationCounter.countNumberOfGenerations(catsFourGeneration.stream().findFirst().get());

        // Then
        assertEquals(4, numberOfGenerations);
    }
}