package com.techelevator;


import org.junit.Test;
import org.junit.Assert;
public class MaxEnd3Test {

    @Test
    public void large_number_in_between_first_and_third_return_large_number_from_third(){
        int [] array = {0, 20, 1};

        MaxEnd3 maxEnd3 = new MaxEnd3();

        int[] returnArray = maxEnd3.makeArray(array);


        //Mistake this will compare the references not the contents in the array
        //Assert.assertEquals(new int[] {1,1,1}, returnArray);

        Assert.assertArrayEquals(new int[] {1,1,1},returnArray);
    }

    @Test
    public void large_number_in_between_first_and_third_return_large_number_from_first(){
        int [] array = {1, 20, 0};

        MaxEnd3 maxEnd3 = new MaxEnd3();

        int[] returnArray = maxEnd3.makeArray(array);


        //Mistake this will compare the references not the contents in the array
        //Assert.assertEquals(new int[] {1,1,1}, returnArray);

        Assert.assertArrayEquals(new int[] {1,1,1},returnArray);
    }

    @Test
    public void large_number_in_between_first_and_third_return_large_number_from_either(){
        int [] array = {1, 20, 1};

        MaxEnd3 maxEnd3 = new MaxEnd3();

        int[] returnArray = maxEnd3.makeArray(array);


        //Mistake this will compare the references not the contents in the array
        //Assert.assertEquals(new int[] {1,1,1}, returnArray);

        Assert.assertArrayEquals(new int[] {1,1,1},returnArray);
    }
}
