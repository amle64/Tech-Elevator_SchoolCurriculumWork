package org.example;

public class SortTest {
    public static void main(String[] args) {
        int[] nums = {5,90,100, 6,2};
        sort(nums);
        for(int n:nums){
            System.out.println(n);
        }
    }
    public static void sort(int[] numbers){

        for(int i=0;i<numbers.length-1;i++){

            if(numbers[i]>numbers[i+1]){
                int temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
            }
        }
    }
}
