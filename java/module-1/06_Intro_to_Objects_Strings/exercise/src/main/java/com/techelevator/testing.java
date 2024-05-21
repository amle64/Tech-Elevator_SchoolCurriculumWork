package com.techelevator;

public class testing {
    public static void main(String[] args) {
        //12345x
        //12345
        System.out.println(doubleX("12345x"));
        System.out.println(doubleX("12345"));
    }
    public static boolean doubleX(String str) {
        String sub = "xx";
        if (str.length()<2){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(i+1==str.length()){
                return false;
            }else if (str.charAt(i)=='x'&&str.charAt(i+1)!='x'){
                return false;
            } else if(str.substring(i,i+2).equals(sub)){
                return true;
            }
        }
        return false;
    }
}
