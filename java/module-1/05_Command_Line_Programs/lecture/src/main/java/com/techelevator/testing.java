package com.techelevator;

public class testing {
    public static void main(String[] args) {
        System.out.println(calculateGrade(90));
        System.out.println(calculateGrade2(90));

    }
    public static char calculateGrade(int score){
        char grade = 'F';
// Section 1
        if( score >= 90 ){
            grade = 'A';
        } else if( score >= 80 ){
            grade = 'B';
        } else if( score >= 70 ){
            grade = 'C';
        }
        return grade;
    }

    static char calculateGrade2(int score){
        char grade = 'F';
// Section 2
        if( score >= 90 ) {
            grade = 'A';
        }
        if( score >= 80 ){
            grade = 'B';
        }
        if( score >= 70 ){
            grade = 'C';
        }
        return grade;
    }
}
