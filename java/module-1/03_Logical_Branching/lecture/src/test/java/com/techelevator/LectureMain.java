package com.techelevator;

public class LectureMain {
    public static void main(String[] args) {
        Lecture exercises = new Lecture();

        System.out.println("returnNotOne: " + exercises.returnNotOne());
        System.out.println("returnNotHalf: " + exercises.returnNotHalf());
        System.out.println("returnName: " + exercises.returnName());
        System.out.println("returnDoubleOfTwo: " + exercises.returnDoubleOfTwo());
        System.out.println("returnNameOfLanguage: " + exercises.returnNameOfLanguage());
        System.out.println("returnTrueFromIf: " + exercises.returnTrueFromIf());
        System.out.println("returnTrueWhenOneEqualsOne: " + exercises.returnTrueWhenOneEqualsOne());
        System.out.println("returnTrueWhenGreaterThanFive: " + exercises.returnTrueWhenGreaterThanFive(6));
        System.out.println("returnTrueWhenGreaterThanFiveInOneLine: " + exercises.returnTrueWhenGreaterThanFiveInOneLine(6));
        System.out.println("returnNumberAfterAddThreeAndAddFive: " + exercises.returnNumberAfterAddThreeAndAddFive(4,true,true));
        System.out.println("returnFizzIfThree: " + exercises.returnFizzIfThree(3));
    }

}
