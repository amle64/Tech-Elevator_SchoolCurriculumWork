package com.techelevator;

import org.junit.Test;
import org.junit.Assert;
public class CigarPartyTest {

    @Test
    public void minimum_cigars_met_party_true(){
        //Arrange
        int testNumber1 = 40;
        int testNumber2 = 41;
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean test1 = cigarParty.haveParty(testNumber1,true);
        boolean test2 = cigarParty.haveParty(testNumber2, false);

        //Assert
        Assert.assertTrue(test1);
        Assert.assertTrue(test2);

    }
    @Test
    public void minimum_cigars_not_met_party_false(){
        //Arrange
        int testNumber1 = 28;
        int testNumber2 = 10;
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean test1 = cigarParty.haveParty(testNumber1,true);
        boolean test2 = cigarParty.haveParty(testNumber2,false);

        //Assert
        Assert.assertFalse(test1);
        Assert.assertFalse(test2);
    }

    @Test
    public void weekend_is_true_party_true(){
        //Arrange
        boolean weekend = true;
        int cigars = 40;
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean test = cigarParty.haveParty(cigars,weekend);

        //Arrange
        Assert.assertTrue(test);

    }
    @Test
    public void weekend_is_false_max_range_of_cigars_true_party_true(){
        //Arrange
        boolean weekend = false;
        int cigars = 40;
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean test = cigarParty.haveParty(cigars,weekend);

        //Arrange
        Assert.assertTrue(test);
    }
    @Test
    public void weekend_is_false_max_range_of_cigars_false_party_false(){
        //Arrange
        boolean weekend = false;
        int cigars = 61;
        CigarParty cigarParty = new CigarParty();

        //Act
        boolean test = cigarParty.haveParty(cigars,weekend);

        //Arrange
        Assert.assertFalse(test);
    }
}
