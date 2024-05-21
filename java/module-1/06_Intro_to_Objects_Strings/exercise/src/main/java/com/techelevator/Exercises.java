package com.techelevator;

public class Exercises {

	/*
     Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     helloName("Bob") → "Hello Bob!"
     helloName("Alice") → "Hello Alice!"
     helloName("X") → "Hello X!"
     */
	public String helloName(String name) {
		String greeting = "Hello ";
		return greeting = greeting+name+"!";
	}

	/*
     Given two strings, a and b, return the result of putting them together in the order abba,
     e.g. "Hi" and "Bye" returns "HiByeByeHi".
     makeAbba("Hi", "Bye") → "HiByeByeHi"
     makeAbba("Yo", "Alice") → "YoAliceAliceYo"
     makeAbba("What", "Up") → "WhatUpUpWhat"
     */
	public String makeAbba(String a, String b) {
		String greeting = a+b+b+a;
		return greeting;
	}

	/*
     The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example,
     the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the
     HTML string with tags around the word, e.g. "<i>Yay</i>".
     makeTags("i", "Yay") → "<i>Yay</i>"
     makeTags("i", "Hello") → "<i>Hello</i>"
     makeTags("cite", "Yay") → "<cite>Yay</cite>"
     */
	public String makeTags(String tag, String word) {
		String text = "<"+tag+">"+word+"</"+tag+">";
		return text;
	}

	/*
     Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the
     middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting
     at index i and going up to but not including index j.
     makeOutWord("<<>>", "Yay") → "<<Yay>>"
     makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
     makeOutWord("[[]]", "word") → "[[word]]"
     */
	public String makeOutWord(String out, String word) {
		String frontSymbol = String.valueOf(out.charAt(0))+String.valueOf(out.charAt(1));
		String endSymbol = String.valueOf(out.charAt(2))+String.valueOf(out.charAt(3));

		return frontSymbol+word+endSymbol;
	}

	/*
     Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string
     length will be at least 2.
     extraEnd("Hello") → "lololo"
     extraEnd("ab") → "ababab"
     extraEnd("Hi") → "HiHiHi"
     */
	public String extraEnd(String str) {
		String twoLetters = "";
		for (int i = 0; i < str.length(); i++) {
			if(i==str.length()-2){
				twoLetters = String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i+1));
				break;
			}
		}

		return twoLetters+twoLetters+twoLetters;
	}

	/*
     Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the
     string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string ""
     yields the empty string "". Note that str.length() returns the length of a string.
     firstTwo("Hello") → "He"
     firstTwo("abcdefg") → "ab"
     firstTwo("ab") → "ab"
     */
	public String firstTwo(String str) {
		String twoLetters = "";
		if (str.length()==1){
			return str;
		} else if(str==twoLetters){
			return str;
		}
		for (int i = 0; i < str.length(); i++) {
			if(i==0){
				twoLetters = String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i+1));
				break;
			}
		}
		return twoLetters;
	}

	/*
     Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     firstHalf("WooHoo") → "Woo"
     firstHalf("HelloThere") → "Hello"
     firstHalf("abcdef") → "abc"
     */
	public String firstHalf(String str) {

		int halfIndex = (str.length()/2)-1;
		String halfWord = "";
		for (int i = 0; i <= halfIndex; i++) {
			halfWord = halfWord+String.valueOf(str.charAt(i));
		}
		return halfWord;
	}

	/*
     Given a string, return a version without the first and last char, so "Hello" yields "ell".
     The string length will be at least 2.
     withoutEnd("Hello") → "ell"
     withoutEnd("java") → "av"
     withoutEnd("coding") → "odin"
     */
	public String withoutEnd(String str) {
		String brokenWord = "";

		for (int i = 0; i < str.length(); i++) {
			if(i!=0 && i!=str.length()-1){
				brokenWord = brokenWord+String.valueOf(str.charAt(i));
			}
		}
		return brokenWord;
	}

	/*
     Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
     on the outside and the longer string on the inside. The strings will not be the same length, but
     they may be empty (length 0).
     comboString("Hello", "hi") → "hiHellohi"
     comboString("hi", "Hello") → "hiHellohi"
     comboString("aaa", "b") → "baaab"
     */
	public String comboString(String a, String b) {
		if (a.length()>b.length()){
			return b+a+b;
		} else {
			return a+b+a;
		}

	}

	/*
     Given 2 strings, return their concatenation, except omit the first char of each. The strings will
     be at least length 1.
     nonStart("Hello", "There") → "ellohere"
     nonStart("java", "code") → "avaode"
     nonStart("shotl", "java") → "hotlava"
     */
	public String nonStart(String a, String b) {
		String word = "";
		for(int i =0;i<a.length();i++){
			if(i>0){
				word = word+String.valueOf(a.charAt(i));
			}
		}
		for (int i = 0; i < b.length(); i++) {
			if(i>0){
				word = word+String.valueOf(b.charAt(i));
			}
		}

		return word;
	}

	/*
     Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
     The string length will be at least 2.
     left2("Hello") → "lloHe"
     left2("java") → "vaja"
     left2("Hi") → "Hi"
     */
	public String left2(String str) {
		String word = "";
		String halfWord = "";
		for (int i = 0; i < str.length(); i++) {

			if (i<2){
				halfWord = halfWord +String.valueOf(str.charAt(i));
			} else {
				word = word + String.valueOf(str.charAt(i));
			}
		}
		return word+halfWord;
	}

	/*
     Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
     The string length will be at least 2.
     right2("Hello") → "loHel"
     right2("java") → "vaja"
     right2("Hi") → "Hi"
     */
	public String right2(String str) {
		String word = "";
		String halfWord = "";
		for (int i = 0; i < str.length(); i++) {

			if (i==str.length()-2||i==str.length()-1){
				word = word +String.valueOf(str.charAt(i));
			} else {
				halfWord = halfWord + String.valueOf(str.charAt(i));
			}
		}
		return word+halfWord;

	}

	/*
     Given a string, return a string length 1 from its front, unless front is false, in which case
     return a string length 1 from its back. The string will be non-empty.
     theEnd("Hello", true) → "H"
     theEnd("Hello", false) → "o"
     theEnd("oh", true) → "o"
     */
	public String theEnd(String str, boolean front) {
		if (front==true){
			return String.valueOf(str.charAt(0));
		} else {
			return String.valueOf((str.charAt(str.length()-1)));
		}

	}

	/*
     Given a string, return a version without both the first and last char of the string. The string
     may be any length, including 0.
     withoutEnd2("Hello") → "ell"
     withoutEnd2("abc") → "b"
     withoutEnd2("ab") → ""
     */
	public String withoutEnd2(String str) {
		if (str.length()<=2){
			return "";
		}
		String word = "";
		for (int i = 0; i < str.length(); i++) {
			if(i>0){
				if(i==str.length()-2){
					word = word+String.valueOf(str.charAt(i));
					break;
				}
				word = word+String.valueOf(str.charAt(i));

			}
		}
		return word;
	}

	/*
     Given a string of even length, return a string made of the middle two chars, so the string "string"
     yields "ri". The string length will be at least 2.
     middleTwo("string") → "ri"
     middleTwo("code") → "od"
     middleTwo("Practice") → "ct"
     */
	public String middleTwo(String str) {
		String word = "";
		//Finding index to start middle chars of string.
		int division = (str.length()/2)-1;

		for (int i = 0; i < str.length(); i++) {
			if (i==division){
				word = word+String.valueOf(str.charAt(i));
			} else if (i==division+1){
				word = word+String.valueOf(str.charAt(i));
				break;
			}
		}
		return word;
	}

	/*
     Given a string, return true if it ends in "ly".
     endsLy("oddly") → true
     endsLy("y") → false
     endsLy("oddy") → false
     */
	public boolean endsLy(String str) {
		//Edge case for length being less than 2
		if (str.length()<2){
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			//Stop loop at the last index which will automatically return false
			if (i==str.length()-1){
				return false;
			}
			//Per loop and will return true if word matches "ly"
			String word = String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i+1));
			if(word.equals("ly")){
				return true;
			}


		}
		return false;
	}

	/*
     Given a string and an int n, return a string made of the first and last n chars from the string. The
     string length will be at least n.
     nTwice("Hello", 2) → "Helo"
     nTwice("Chocolate", 3) → "Choate"
     nTwice("Chocolate", 1) → "Ce"
     */
	public String nTwice(String str, int n) {
		String word = "";
		//First half of the problem, grabs n number of characters in the first half
		for (int i = 0; i < str.length(); i++) {
			if(i<=n-1){
				word = word+String.valueOf(str.charAt(i));
			}
		}
		//Second half of the problem, grabs n number of characters in the second half

		for (int i = 0; i < str.length(); i++) {
			//Index at second half
			if (i==str.length()-n){
				//Repeat n times and break loop
				for (int j = 0; j < n; j++) {
					word = word+String.valueOf(str.charAt(i));
					i++;
				}
				break;
			}
		}
		return word;
	}

	/*
     Given a string and an int n, return a string that starts at n and has a length of 2. Note that n may or may not be a valid
     location in the string. If n is too low or too high to define a string of length 2, return the string's first 2 characters.
     The string length will be at least 2.
     twoChar("java", 0) → "ja"
     twoChar("java", 2) → "va"
     twoChar("java", 3) → "ja"
     */
	public String twoChar(String str, int n) {
		String word = "";
		//Edge cases for negative integers or integers that are too large compared to string
		if (n<0||n>=str.length()){
			int i = 0;
			word = String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i+1));
			return word;
			//Edge case when string is 2 length
		} else if (str.length()==2){
			int i = 0;
			word = String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i+1));
			return word;
		}
		//For loop that works for normal strings and stops when at nth index
		for (int i = 0; i < str.length(); i++) {

			if (i==n){
				word = word+String.valueOf(str.charAt(i));
				i++;
				word = word+String.valueOf(str.charAt(i));
				break;
			}
		}
		return word;
	}

	/*
     Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
     The string length will be at least 3.
     middleThree("Candy") → "and"
     middleThree("and") → "and"
     middleThree("solving") → "lvi"
     */
	public String middleThree(String str) {
		String word = "";
		int findingIndex = (str.length()-3)/2;

		for (int i = 0; i < str.length(); i++) {
			if (i==findingIndex){
				for (int j = 0; j < 3; j++) {
					word = word+str.charAt(i);
					i++;
				}
				break;
			}
		}
		return word;
	}

	/*
     Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with
     "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals()
     to compare 2 strings.
     hasBad("badxx") → true
     hasBad("xbadxx") → true
     hasBad("xxbadxx") → false
     */
	public boolean hasBad(String str) {
		String word = "bad";
		if(str.length()<3){
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (String.valueOf(str.charAt(i)).equals("b")&&
					String.valueOf(str.charAt(i+1)).equals("a")&&
					String.valueOf(str.charAt(i+2)).equals("d")&&(i<2)){
				return true;
			}
		}
		return false;
	}

	/*
     Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     stringTimes("Hi", 2) → "HiHi"
     stringTimes("Hi", 3) → "HiHiHi"
     stringTimes("Hi", 1) → "Hi"
     */
	public String stringTimes(String str, int n) {
		String word = "";
		for (int i = 0; i < n; i++) {
			word = word+str;
		}
		return word;
	}

	/*
     Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or
     whatever is there if the string is less than length 3. Return n copies of the front;
     frontTimes("Chocolate", 2) → "ChoCho"
     frontTimes("Chocolate", 3) → "ChoChoCho"
     frontTimes("Abc", 3) → "AbcAbcAbc"
     */
	public String frontTimes(String str, int n) {
		String word = "";
		if (str.length()<3){
			for (int i = 0; i < n; i++) {
				word = word+str;
			}
			return word;
		}
		String sub = str.substring(0,3);
		for (int i = 0; i < n; i++) {
			word = word + sub;
		}
		return word;
	}

	/*
     Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     countXX("abcxx") → 1
     countXX("xxx") → 2
     countXX("xxxx") → 3
     */
	public int countXX(String str) {
		//Filter word out of sting
		String sub = "xx";

		//Initialize count
		int count = 0;


		for (int i = 0; i < str.length(); i++) {
			//Edge case when at the end of the loop
			if (i+1==str.length()){
				break;

				//Add count when substring at current index matches with sub, "xx"
				//i+sub.length is 2 indexes after currentIndex
			} else if ((str.substring(i,i+sub.length()).equals(sub))){
				count++;
			}

		}
		return count;
	}

	/*
     Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     doubleX("axxbb") → true
     doubleX("axaxax") → false
     doubleX("xxxxx") → true
     */
	public boolean doubleX(String str) {
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

	/*
     Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
     stringBits("Hello") → "Hlo"
     stringBits("Hi") → "H"
     stringBits("Heeololeo") → "Hello"
     */
	public String stringBits(String str) {
		return null;
	}

	/*
     Given a non-empty string like "Code" return a string like "CCoCodCode".
     stringSplosion("Code") → "CCoCodCode"
     stringSplosion("abc") → "aababc"
     stringSplosion("ab") → "aab"
     */
	public String stringSplosion(String str) {
		return null;
	}

	/*
     Given a string, return the count of the number of times that a substring length 2 appears in the string and
     also as the last 2 chars of the string.

     We don't count the end subString, so "hixxxhi" yields 1, but the subString may overlap a prior position by one.
     For instance, "xxxx" has a count of 2: one pair at position 0, and the second at position 1. The third pair at
     position 2 is the end subString, which we don't count.

     last2("hixxhi") → 1
     last2("xaxxaxaxx") → 1
     last2("axxxaaxx") → 2
     last2("xxxx") -> 2
     */
	public int last2(String str) {
		return 0;
	}

	/*
     Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end
     should not be removed.
     stringX("xxHxix") → "xHix"
     stringX("abxxxcd") → "abcd"
     stringX("xabxxxcdx") → "xabcdx"
     */
	public String stringX(String str) {
		return null;
	}

	/*
     Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
     altPairs("kitten") → "kien"
     altPairs("Chocolate") → "Chole"
     altPairs("CodingHorror") → "Congrr"
     */
	public String altPairs(String str) {
		return null;
	}

	/*
     Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed.
     The "yak" strings will not overlap.
     stringYak("yakpak") → "pak"
     stringYak("pakyak") → "pak"
     stringYak("yak123ya") → "123ya"
     */
	public String stringYak(String str) {
		return null;
	}

}
