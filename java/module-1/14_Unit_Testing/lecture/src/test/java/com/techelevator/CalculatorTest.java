package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void setUp(){
        System.out.printf("Test starting for ");
    }
    @After
    public void tearDemo(){
        System.out.println("Test complete!");
    }
    @Test
    public void add_should_return_sum_of_two_numbers(){
        System.out.println("add_should_return_sum_of_two_numbers");
        //Arrange
        int first = 10;
        int second = 15;

        Calculator calculator = new Calculator();

        //Act

        int actual = calculator.add(first,second);

        //Assert
        Assert.assertEquals("Please check your code for correct operation",first+second,actual);


    }
    @Test
    public void subtract_should_return_difference_of_two_numbers(){
        System.out.println("subtract_should_return_difference_of_two_numbers");
        //Arrange
        double first = 10;
        double second = 15;

        Calculator calculator = new Calculator();

        //Act

        double actual = calculator.subtract(first,second);

        //Assert
        Assert.assertEquals("Please check your code for correct operation",first-second,actual, 0.001);
    }

    @Test
    public void divBy2_should_return_false(){
        System.out.println("divBy2_should_return_false");
        //Arrange

        Calculator calculator = new Calculator();

        //Act

        boolean actual = calculator.divBy2(3);

        //Assert
        Assert.assertFalse("Please check your code for correct operation",actual);
    }

    @Test
    public void divBy2_should_return_true(){
        System.out.println("divBy2_should_return_true");
        //Arrange

        Calculator calculator = new Calculator();

        //Act

        boolean actual = calculator.divBy2(4);

        //Assert
        Assert.assertTrue("Please check your code for correct operation",actual);
    }

}
