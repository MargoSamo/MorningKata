package com.mariia.breeding;

import org.junit.jupiter.api.Test;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class FemaleTest {

    @Test
    public void femaleCatShouldBreedingMaleCatRezNewCat() {
        //Given
        var male = new Male();
        var female = new Female();

        //When
        var cats = female.breed(male);

        //Then
        assertEquals(cats.size(), 5);
        var males = cats.stream().filter((cat) -> cat.getSex() == Sex.MALE).collect(Collectors.toList());
        assertEquals(males.size(), 3);
        var females = cats.stream().filter((cat) -> cat.getSex() == Sex.FEMALE).collect(Collectors.toList());
        assertEquals(females.size(), 2);
    }
}