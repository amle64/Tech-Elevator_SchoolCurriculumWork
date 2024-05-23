package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String,String> nameToZip = new HashMap<>();

		nameToZip.put("Elizabeth", "44012");
		nameToZip.put("David", "44120");
		nameToZip.put("Dan", "44124");

		/*System.out.println(nameToZip.get("David"));
		System.out.println(nameToZip.get("Dan"));
		System.out.println(nameToZip.get("Elizabeth"));*/

		/*Set <String> keys = nameToZip.keySet();

		for(String key:keys){
			System.out.println(key+" is for "+nameToZip.get(key));
		}*/

		Set<Map.Entry <String,String>> nameToZipSet = nameToZip.entrySet();
		for(Map.Entry<String, String> r:nameToZipSet){
			String key = r.getKey();
			System.out.println(key);
			String value = r.getValue();
			System.out.println(value);
		}
	}

}
