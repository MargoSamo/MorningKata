package com.mariia.hungrycat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    public void catShouldWeighMoreWhenEatMouse() {
        //Given
        var cat = new Cat("One", 5);
        var mouse = new Mouse("One", 5);

        //When
        cat.eatMouse(mouse);

        //Then
        assertEquals(10, (cat.getCatWeight() + mouse.getMouseWeight()));
    }
}