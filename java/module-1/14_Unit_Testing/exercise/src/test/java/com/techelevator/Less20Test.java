package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {
    @Test
    public void less_than_multiple_of_20_is_true(){
        //Arrange
        int number1 = 38;
        int number2 = 39;
        Less20 less20 = new Less20();

        //Act
        boolean test1 = less20.isLessThanMultipleOf20(number1);
        boolean test2 = less20.isLessThanMultipleOf20(number2);

        //Assert
        Assert.assertTrue(test1);
        Assert.assertTrue(test2);
    }

    @Test
    public void less_than_multiple_of_is_false(){
        //Arrange
        int number = 40;
        Less20 less20 = new Less20();

        //Act
        boolean test = less20.isLessThanMultipleOf20(number);

        //Assert
        Assert.assertFalse(test);
    }
}
