package com.techelevator;

public class PassByRef {
    public static void main(String[] args) {


        int testNum = 5;
        passValue(testNum);
        System.out.println(testNum);

        int[] testArray = {5,8,100, 80,7,4};
        bubbleSort(testArray);
        System.out.println("After bubble sort");
        for (int n:testArray) {
            System.out.println(n);
        }

    }

    /*public static int nestedLoop(int n){
        int sum = 0;
        for (int i = 0; i < ; i++) {

            sum = sum +i;
        }
        return sum;
    }*/
    public static void passValue(int num){
        num = 100;
    }
    public static void bubbleSort(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i]=1;
        }
        /*for (int i = 0; i <= arr.length-1; i++) {

            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];

                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }*/
    }
}
