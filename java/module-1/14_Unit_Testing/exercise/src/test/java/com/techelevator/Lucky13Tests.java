package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {
    @Test
    public void if_1_or_3_should_be_false(){
        //Arrange
        int[] testArr = {0,2,1,3};

        //Act
        Lucky13 lucky13 = new Lucky13();
        boolean actualRet = lucky13.getLucky(testArr);
        //Assert
        Assert.assertFalse("Number is not 1 or 3 present.",actualRet);
    }

    @Test
    public void if_1_or_3_should_be_true(){
        //Arrange
        int[] testArr = {0,2,4};

        //Act
        Lucky13 lucky13 = new Lucky13();
        boolean actualRet = lucky13.getLucky(testArr);
        //Assert
        Assert.assertTrue("Number is not 1 or 3 present.",actualRet);
    }
}
