package com.techelevator;

public class Lecture {
    public static void main(String[] args) {

        int result = square(4);
        System.out.println(result);

        result = sumArr(4);
        System.out.println(result);

        result = nestedLoop(4);
        System.out.println(result);
    }

    public static int square(int n) {    // O(1)
        int square = n * n;
        return n;
    }

    public static int sumArr(int n) {    // O(n)
        int sum = 0;
        for (int i = 0; i <= n; i++) {

            sum = sum + i;
        }
        return sum;
    }

    public static int nestedLoop(int n) {    // O(n^2)
        int sum = 0;
        for (int j = 0; j <= n; j++) {
            for (int i = 0; i < n; i++) {

                sum = sum + i;
            }
        }
        return sum;
    }



}