package com.techelevator;


import org.junit.Test;
import org.junit.Assert;

public class StringBitsTest {

    @Test
    public void skips_every_other_char(){
        String str = "bobcat";

        StringBits stringBits = new StringBits();

        String result = stringBits.getBits(str);

        Assert.assertEquals("bba",result);
    }
    @Test
    public void string_is_null(){
        String str = null;

        StringBits stringBits = new StringBits();

        String result = stringBits.getBits(str);

        Assert.assertEquals("",result);
    }


}
