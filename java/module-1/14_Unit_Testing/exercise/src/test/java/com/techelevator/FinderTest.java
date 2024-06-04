package com.techelevator;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FinderTest {

    @Test
    public void integerList_is_empty_returns_null(){
        List<Integer> list = new ArrayList<>(0);


        Finder finder = new Finder();

        //If null, then the list is empty
        boolean test1 = finder.findLargest(list)==null;

        Assert.assertEquals(true,test1);


    }

    @Test
    public void integerList_has_values_find_largest_number(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));


        Finder finder = new Finder();

        int test1 = finder.findLargest(list);

        Assert.assertEquals(5,test1);
    }
}
