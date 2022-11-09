package com.mariia.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void shouldGetSumWeight() {
        //Given
        var cat = new Cat("One", 5);
        var mouse = new Mouse("One", 5);

        //When
        cat.eatMouse(mouse);

        //Then
        assertEquals(10, (cat.getCatWeight() + mouse.getMouseWeight()));
    }



}