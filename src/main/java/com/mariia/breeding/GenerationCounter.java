package com.mariia.breeding;

public class GenerationCounter {
    private int counter = 1;

    public int countNumberOfGenerations(BreedingCat breedingCat) {
        var tempCat = breedingCat;

        while (tempCat.getMother() != null) {
            counter++;
            tempCat = tempCat.getMother();
        }
        return counter;
    }

    @Override
    public String toString() {
        return "GenerationCounter{" +
                "counter=" + counter +
                '}';
    }
}
