package com.techelevator;


import org.junit.Test;
import org.junit.Assert;
public class NonStartTest {

    @Test
    public void concat_two_strings_and_return_all_but_first_char_for_each(){
        String a = "bob";
        String b = "cat";

        NonStart nonStart = new NonStart();

        String result = nonStart.getPartialString(a,b);
        Assert.assertEquals("obat",result);
    }

    @Test
    public void concat_two_strings_and_first_string_is_null(){
        String a = null;
        String b = "cat";

        NonStart nonStart = new NonStart();

        String result = nonStart.getPartialString(a,b);
        Assert.assertEquals("at",result);
    }

    @Test
    public void concat_two_strings_and_second_string_is_null(){
        String a = "bob";
        String b = null;

        NonStart nonStart = new NonStart();

        String result = nonStart.getPartialString(a,b);
        Assert.assertEquals("ob",result);
    }

    @Test
    public void concat_two_strings_and_both_strings_are_null(){
        String a = null;
        String b = null;

        NonStart nonStart = new NonStart();

        String result = nonStart.getPartialString(a,b);
        Assert.assertEquals("",result);
    }
}
