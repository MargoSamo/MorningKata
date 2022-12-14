package com.mariia.breeding;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class CatFemaleTest {

    @Test
    public void femaleCatShouldBreedingMaleCatRezNewCat() {
        // Given
        var male = new CatMale(null, null);
        var female = new CatFemale(null, null);

        // When
        var cats = female.breed(male);

        // Then
        assertEquals(cats.size(), 5);
        var males = cats.stream().filter((cat) -> cat.getSex() == Sex.MALE).collect(Collectors.toList());
        assertEquals(males.size(), 3);
        var females = cats.stream().filter((cat) -> cat.getSex() == Sex.FEMALE).collect(Collectors.toList());
        assertEquals(females.size(), 2);
    }

    @Test
    public void childShouldKnowParents() {
        // Given
        var male = new CatMale(null, null);
        var female = new CatFemale(null, null);
        var cats = female.breed(male);


        for (BreedingCat cat : cats) {
            // When
            var mother = cat.getMother();
            var father = cat.getFather();

            // Then
            assertEquals(female, mother);
            assertEquals(male, father);
        }
    }

    @Test
    public void motherShouldKnowChild() {
        // Given
        var male = new CatMale(null, null);
        var female = new CatFemale(null, null);
        var cats = female.breed(male);
        var cats2 = female.breed(male);
        List<BreedingCat> childrenAll = new ArrayList<>();
        childrenAll.addAll(cats);
        childrenAll.addAll(cats2);

        // When
        var children = female.getChildren();

        // Then
        assertEquals(childrenAll, children);
    }

    @Test
    public void catFemaleKnowChild() {
        // Given
        var male = new CatMale(null, null);
        var female = new CatFemale(null, null);
        var cats = female.breed(male);

        var oneCat = cats.stream().findFirst().get();

        // When
        var result = female.isMyChild(oneCat);

        // Then
        assertTrue(result);
    }
}