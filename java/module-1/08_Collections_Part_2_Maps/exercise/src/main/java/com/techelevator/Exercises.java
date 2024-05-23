package com.techelevator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercises {

	/*
	 * Create and return a Map that contains the following data
	 * of animals and the name of a group of that animal.
	 *
	 * rhino -> crash
	 * giraffe -> tower
	 * elephant -> herd
	 * lion -> pride
	 * crow -> murder
	 * pigeon -> kit
	 * flamingo -> pat
	 * deer -> herd
	 * dog -> pack
	 * crocodile -> float
	 *
	 */
	public Map<String, String> animalGroupName() {
		Map<String,String> animals = new HashMap<>();

		animals.put("rhino","crash");
		animals.put("giraffe","tower");
		animals.put("elephant","herd");
		animals.put("lion","pride");
		animals.put("crow","murder");
		animals.put("pigeon","kit");
		animals.put("flamingo","pat");
		animals.put("deer","herd");
		animals.put("dog","pack");
		animals.put("crocodile","float");

		return animals;
	}

	/*
	 * Given a Map and a String item number, look for the item number in the Map
	 * and return its value that represents the discount percentage if the item is on sale.
	 *
	 * If the item number isn't in the map, or is empty, or is null, return 0.00 instead.
	 *
	 * For example, the Map might have keys and values such as:
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 *
	 * The item number should be case-insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale({"KITCHEN4001": 0.20, "GARAGE1070": 0.15}, "kitchen4001") → 0.20
	 * isItOnSale({"LIVINGROOM": 0.10, "KITCHEN6073": 0.40}, "") → 0.00
	 * isItOnSale({"BEDROOM3434": 0.60, "GARAGE1070": 0.15}, "GARAGE1070") → 0.15
	 * isItOnSale({"KITCHEN4001": 0.20, "BATH0073": 0.15}, "spaceship9999") → 0.00
	 *
	 */
	public double isItOnSale(Map<String, Double> itemsOnSale, String itemNumber) {
		Set<Map.Entry<String, Double>> itemsSet = itemsOnSale.entrySet();

		if(itemNumber==null){
			return 0.00;
		} else if (itemNumber.isEmpty()){
			return 0.00;
		}
		for (Map.Entry<String,Double> items: itemsSet){

			if(itemNumber.equalsIgnoreCase(items.getKey())){
				//System.out.println(items.getKey()+" (key) matches with "+itemNumber);
				return items.getValue();

			}

		}

		return 0.00;
	}
	/*public static void main(String[] args) {
		Exercises ex = new Exercises();
		//ex.last2Revisited(new String [] {"hixxhi", "xaxxaxaxx", "axxxaaxx"});
		//Map<String,Double> map = new HashMap<>();
		Map<String, Double> itemsOnSale = new HashMap<>();
		itemsOnSale.put("KITCHEN4001", 0.20);
		itemsOnSale.put("GARAGE1070", 0.15);
		itemsOnSale.put("LIVINGROOM", 0.10);
		itemsOnSale.put("KITCHEN6073", 0.40);
		itemsOnSale.put("BEDROOM3434", 0.60);
		itemsOnSale.put("BATH0073", 0.15);
		itemsOnSale.put("DEN5309", 0.25);
		String nullStr = null;
		ex.isItOnSale(itemsOnSale, nullStr);
	}*/

	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * robPeterToPayPaul({"Peter": 101, "Paul": 500}) → {"Peter": 51, "Paul": 550}
	 * robPeterToPayPaul({"Peter": 0, "Paul": 500}) → {"Peter": 0, "Paul": 500}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		int amountGiven = 0;
		int amountGiven2 = 0;
		if(peterPaul.get("Peter")>0&&peterPaul.get("Paul")<1000){
			amountGiven2 = (int) Math.ceil((peterPaul.get("Peter")/2.0));
			amountGiven = (int) (peterPaul.get("Peter")/2.0);
			//peterPaul.replace("Peter",peterPaul.get("Peter"),amountGiven);

			peterPaul.replace("Paul",peterPaul.get("Paul"),peterPaul.get("Paul")+amountGiven);
			peterPaul.replace("Peter",peterPaul.get("Peter"),amountGiven2);


		}
		//System.out.println(peterPaul);
		System.out.println(amountGiven2+"integer value is "+amountGiven);

		return peterPaul;
	}

	/*public static void main(String[] args) {
		Exercises ex = new Exercises();
		Map <String,Integer> peterPaul = new HashMap<>();
		peterPaul.put("Peter",2000);
		peterPaul.put("Paul",30000);

		ex.robPeterToPayPaul(peterPaul);
	}*/

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "Partnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "Partnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		if(peterPaul.get("Peter")>=5000&&peterPaul.get("Paul")>=10000){
			peterPaul.put("Partnership",(int) (0.25*peterPaul.get("Peter")+0.25*peterPaul.get("Paul")));
			peterPaul.replace("Peter",(int) (0.75*peterPaul.get("Peter")));
			peterPaul.replace("Paul", (int) (0.75*peterPaul.get("Paul")));

		} else {
			return peterPaul;
		}
		return peterPaul;
	}

	/*
	 * Given an array of non-empty strings, return a Map<String, String> where, for every String in the array,
	 * there is an entry whose key is the first character of the string.
	 *
	 * The value of the entry is the last character of the String. If multiple Strings start with the same letter, then the
	 * value for that key should be the later String's last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["code", "bug", "cat"]) → {"b": "g", "c": "t"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String,String> begAndEnd = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			begAndEnd.put(String.valueOf(words[i].charAt(0)), String.valueOf(words[i].charAt(words[i].length() - 1)));

		}

		return begAndEnd;
	}



	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> wordCountMap = new HashMap<>();
		//int [] wordCountArray = new int [words.length];
		for (int i = 0; i < words.length; i++) {
			if (wordCountMap.containsKey(words[i])) {

				wordCountMap.put(words[i], wordCountMap.get(words[i]) + 1);

			} else {

				wordCountMap.put(words[i], 1);
			}
		}
		return wordCountMap;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> numberCountMap = new HashMap<>();
		//int [] wordCountArray = new int [words.length];
		for (int i = 0; i < ints.length; i++) {
			if (numberCountMap.containsKey(ints[i])) {

				numberCountMap.put(ints[i], numberCountMap.get(ints[i]) + 1);

			} else {

				numberCountMap.put(ints[i], 1);
			}
		}
		return numberCountMap;
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["apple", "banana", "apple", "carrot", "banana"]) → {"banana": true, "carrot": false, "apple": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String,Boolean> wordMultiple = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			if(wordMultiple.containsKey(words[i])){
				wordMultiple.put(words[i],true);
			} else {
				wordMultiple.put(words[i],false);
			}

		}
		return wordMultiple;
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {
		//Initialize combined Map
		Map <String, Integer> combinedInventory = new HashMap<>();

		//Create keyset for remote warehouse
		Set<String> keys1 = remoteWarehouse.keySet();

		//Enter key pairs for the combinedInventory based on remoteWarehouse Map
		for (String key:keys1){
			combinedInventory.put(key,remoteWarehouse.get(key));
		}

		//Initialize key pairs from mainWarehouse map
		Set<String> keys2 = mainWarehouse.keySet();
		for (String key:keys2){
			//System.out.println(key);

			//If mainwarehouse(key) matches with a key in combined inventory, update the total by combining the values
			if(combinedInventory.containsKey(key)){
				combinedInventory.put(key, combinedInventory.get(key)+mainWarehouse.get(key));
			}
			//Handles new unique keys from mainWarehouse to add onto the combinedInventory
			else {
				combinedInventory.put(key,mainWarehouse.get(key));
			}
		}
		return combinedInventory;
	}

	public static void main(String[] args) {
		Exercises ex = new Exercises();
		//ex.beginningAndEnding(new String[] {"code", "bug"});
		Map<String,Integer> mainMap = new HashMap<>();
		mainMap.put("SKU3",44);
		mainMap.put("SKU1",100);
		mainMap.put("SKU2",453);

		Map<String,Integer> remoteMap = new HashMap<>();
		remoteMap.put("SKU4",5);
		remoteMap.put("SKU2",11);

		ex.consolidateInventory(mainMap,remoteMap);
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, its last2 count is the number of times that a subString length 2
	 * appears in the String and also as the last 2 chars of the String.
	 *
	 * We don't count the end subString, so "hixxxhi" has a last2 count of 1, but the subString may overlap a prior
	 * position by one.  For instance, "xxxx" has a count of 2: one pair at position 0, and the second at position 1.
	 * The third pair at position 2 is the end subString, which we don't count.
	 *
	 * Return a Map<String, Integer> where the keys are the Strings from the array and the values are the last2 counts.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map <String, Integer> output = new HashMap<>();
		
		//output.put("hixxhi",1);
		for (String word:words){
			//System.out.println(word);
			int count = 0;
			if (word.length() > 2) {
				String last2 = word.substring(word.length() - 2);
				for (int i = 0; i < word.length() - 2; i++) {
					if (word.substring(i, i + 2).equals(last2)) {
						count++;
					}
				}
			}
			output.put(word,count);
		}
		System.out.println(output);
		return output;
	}





}


