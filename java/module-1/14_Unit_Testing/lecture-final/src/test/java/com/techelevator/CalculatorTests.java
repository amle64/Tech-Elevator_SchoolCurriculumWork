package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTests {



    @Before
    public void setUp(){
        System.out.println("Test starting:");

    }
    @After
    public void tearDemo() {
        System.out.println("Test complete.");

    }

    @Test
    public void add_returns_the_sum_of_two_numbers(){
        System.out.println("add_returns_the_sum_of_two_numbers");
        //Arrange
        int first = 30;
        int second = 20;
        Calculator calculator = new Calculator();
        //Act
        int retNum = calculator.add(first,second);
        //Assert
        Assert.assertEquals("Incorrect result, please check your code.",first+second, retNum);
    }
    @Test
    public void subtract_returns_the_difference_of_two_numbers(){
        System.out.println("subtract_returns_the_difference_of_two_numbers");
        //Arrange
        int first = 30;
        int second = 20;
        Calculator calculator = new Calculator();
        //Act
        int retNum = calculator.subtract(first,second);
        //Assert
        Assert.assertEquals("Incorrect result, please check your code.",first-second, retNum);
    }

    @Test
    public void subtract_double_returns_the_difference_of_two_numbers(){
        System.out.println("subtract_returns_the_difference_of_two_numbers");
        //Arrange
        double first = 30;
        double second = 20;
        Calculator calculator = new Calculator();
        //Act
        double retNum = calculator.subtract(first,second);
        //Assert
        Assert.assertEquals("Incorrect result, please check your code.",first-second, retNum, 0.001);
    }

    @Test
    public void multiply_returns_the_product_of_two_numbers(){
        System.out.println("multiply_returns_the_product_of_two_numbers");
        //Arrange
        int first = 30;
        int second = 20;
        Calculator calculator = new Calculator();
        //Act
        int retNum = calculator.multiply(first,second);
        //Assert
        Assert.assertEquals("Incorrect result, please check your code.",first*second, retNum );
    }

    @Test
    public void three_divBy2_should_return_false(){
        System.out.println("isEven_returns_true_if_the_number_is_even");
        //Arrange


        Calculator calculator = new Calculator();
        //Act
        boolean actualResult = calculator.divBy2(3);

        //Assert
        //Assert.assertEquals("Incorrect result, please check your code.",true, isEven);
        Assert.assertFalse("Incorrect result, please check your code.", actualResult);
    }
    @Test
    public void four_divBy2_should_return_true(){
        System.out.println("isEven_returns_true_if_the_number_is_even");
        //Arrange


        Calculator calculator = new Calculator();
        //Act
        boolean actualResult = calculator.divBy2(4);

        //Assert
        //Assert.assertEquals("Incorrect result, please check your code.",true, isEven);
        Assert.assertTrue("Incorrect result, please check your code.", actualResult);
    }
}
