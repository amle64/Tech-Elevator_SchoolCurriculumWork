package com.techelevator;

import org.junit.Test;
import org.junit.Assert;
public class DateFashionTest {

    @Test
    public void you_or_date_are_not_pretty_no_table(){
        //"pretty" is considered to be 8, If below 2 then no table is received
        //Arrange
        int you1 = 1;
        int date1 = 8;

        int you2 = 8;
        int date2 = 1;

        DateFashion datefashion = new DateFashion();

        //Act
        int test1 = datefashion.getATable(you1,date1);
        int test2 = datefashion.getATable(you2,date2);

        //Assert
        Assert.assertEquals(0,test1);
        Assert.assertEquals(0,test2);

    }

    @Test
    public void you_or_date_are_pretty_table_received(){
        //Arrange
        int you1 = 8;
        int date1 = 3;

        int you2 = 3;
        int date2 = 8;

        DateFashion datefashion = new DateFashion();

        //Act
        int test1 = datefashion.getATable(you1,date1);
        int test2 = datefashion.getATable(you2,date2);

        //Assert
        Assert.assertEquals(2,test1);
        Assert.assertEquals(2,test2);
    }

    @Test
    public void you_and_date_are_between_2_and_8_table_is_maybe(){
        //Arrange
        int you1 = 7;
        int date1 = 3;

        int you2 = 3;
        int date2 = 7;

        DateFashion datefashion = new DateFashion();

        //Act
        int test1 = datefashion.getATable(you1,date1);
        int test2 = datefashion.getATable(you2,date2);

        //Assert
        Assert.assertEquals(1,test1);
        Assert.assertEquals(1,test2);
    }
}
