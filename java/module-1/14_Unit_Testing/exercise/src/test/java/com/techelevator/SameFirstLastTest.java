package com.techelevator;

import org.junit.Test;
import org.junit.Assert;
public class SameFirstLastTest {

    @Test
    public void array_is_null(){
        int [] array = new int[0];

        SameFirstLast sameFirstLast = new SameFirstLast();

        boolean result = sameFirstLast.isItTheSame(array);

        Assert.assertFalse(result);
    }

    @Test
    public void array_length_is_one_or_more_elements_match(){

        int [] array = {1,0,1};

        SameFirstLast sameFirstLast = new SameFirstLast();

        boolean result = sameFirstLast.isItTheSame(array);

        Assert.assertTrue(result);
    }
    @Test
    public void array_length_is_one_or_more_elements_mismatch(){

        int [] array = {1,0,2};

        SameFirstLast sameFirstLast = new SameFirstLast();

        boolean result = sameFirstLast.isItTheSame(array);

        Assert.assertFalse(result);
    }
}
