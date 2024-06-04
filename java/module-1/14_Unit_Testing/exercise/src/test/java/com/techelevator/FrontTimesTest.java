package com.techelevator;

import org.junit.Test;
import org.junit.Assert;
public class FrontTimesTest {

    @Test
    public void string_is_null_result_is_empty(){
        String str = null;
        int n = 1;
        FrontTimes frontTimes = new FrontTimes();

        String result = frontTimes.generateString(str,n);

        Assert.assertEquals("",result);
    }

    @Test
    public void string_equal_or_less_than_3_length_repeat(){
        String str = "bob";
        int n = 2;
        FrontTimes frontTimes = new FrontTimes();

        String result = frontTimes.generateString(str,n);

        Assert.assertEquals("bobbob",result);
    }

    @Test
    public void string_greater_than_3_repeat_only_first_3_chars_repeat_multiple(){
        String str = "bobworld";
        int n = 4;
        FrontTimes frontTimes = new FrontTimes();

        String result = frontTimes.generateString(str,n);

        Assert.assertEquals("bobbobbobbob",result);
    }
}
