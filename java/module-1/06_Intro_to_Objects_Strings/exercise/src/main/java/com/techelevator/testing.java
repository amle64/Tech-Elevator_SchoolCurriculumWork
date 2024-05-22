package com.techelevator;

public class testing {
    public static void main(String[] args) {
        /*stringX("xxHxix") → "xHix"
        stringX("abxxxcd") → "abcd"
        stringX("xabxxxcdx") → "xabcdx"*/
        //printArray(stringX("xxHxix"));
        //printArray(stringX("abxxxcd"));//doesn't split
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("xabxxxcdx"));
        System.out.println(stringX("abxxxcd")); //GOOD
    }

        public static String stringX(String str) {
            String[] word = new String[str.length()];
            word = str.split("x");
            String finalWord = "";
            if(str.charAt(0)=='x'||str.charAt(str.length()-1)=='x'){
                for (int i = 0; i < word.length; i++) {
                    if(i>0&&i<str.length()-1){
                        if(!word[i].equals("")){
                            finalWord = finalWord+word[i];
                        }
                    }
                }
                finalWord = 'x'+finalWord+'x';

            }else {
                for (int i = 0; i < word.length; i++) {
                    if(!word[i].equals("")){
                        finalWord = finalWord+word[i];
                    }
                }
            }
            System.out.println("str is "+str);
            return finalWord;
        }
        public static void printArray (String [] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println("array["+i+"]"+array[i]);
            }
        }
    }

