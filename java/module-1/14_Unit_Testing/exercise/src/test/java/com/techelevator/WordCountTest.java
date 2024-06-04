package com.techelevator;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {
    @Test
    public void string_array_is_null(){
        String [] array = new String[0];

        WordCount wordCount = new WordCount();
        Map<String,Integer> result = wordCount.getCount(array);

        Assert.assertEquals(new HashMap<>(),result);

    }
    @Test
    public void string_array_returns_correct_number_of_times(){
        String [] array = {"0","1","0","2","1"};

        WordCount wordCount = new WordCount();
        Map<String,Integer> result = wordCount.getCount(array);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("0",2);
        expected.put("1",2);
        expected.put("2",1);

        Assert.assertEquals(expected,result);
    }
}
