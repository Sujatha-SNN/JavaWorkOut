package workout.week2.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CharacterCountinString {

	public static void main(String[] args) {
		String str="Karma is powerful than God";
		char[] charArray = str.toCharArray();
		//Method 1
		HashMap<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (hmap.containsKey(charArray[i])) {
				hmap.put(charArray[i], hmap.get(charArray[i]) + 1);
			} else {
				hmap.put(charArray[i], 1);
			}
		}
		System.out.println(hmap);
		
		//Method 2
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			int length = str.replaceAll("[^" +charArray[i] +"]", "").length();
			boolean add = set.add(charArray[i]);
			if(add)
			System.err.print(charArray[i] + "=" + length + " ");
		}
		
		//Method 3
		for (int j = 0; j < charArray.length; j++) {
			char c = charArray[j];
			set.add(charArray[j]);
		}
		System.out.println(set);
		
		List<Character> list=new ArrayList<>(set);
		for (int j = 0; j < list.size(); j++) {
			Character character = list.get(j);
			System.out.print(list.get(j) + "-> " + str.chars().filter(i -> i == character).count() + " ");	
			
		}
		
			
		
		
		
		

	}

}
