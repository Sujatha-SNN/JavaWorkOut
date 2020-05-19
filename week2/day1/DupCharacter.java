package workout.week2.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class DupCharacter {

	public static void main(String[] args) {
		String str = "When life gives you lemons, make lemonade";
		
		
		// Method 1
		HashMap<Character, Integer> duphmap = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (duphmap.containsKey(charArray[i])) {
				duphmap.put(charArray[i], duphmap.get(charArray[i]) + 1);

			} else {
				duphmap.put(charArray[i], 1);
			}
		}
		for (Entry<Character, Integer> entry : duphmap.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey()+ "__ " +entry.getValue());
		}

		// Method 2

		char[] charArray2 = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<>();
		Set<Character> dupCharSet = new LinkedHashSet<>();
		for (int i = 0; i < charArray2.length; i++) {

			if (!charSet.add(charArray2[i])) {
				dupCharSet.add(charArray2[i]);
			}

		}

		System.out.print(dupCharSet);
		List<Character> charList = new ArrayList<>();
		for (int i = 0; i < charArray2.length; i++) {
			charList.add(charArray2[i]);
			

		}

		//Method 3
		
		List<Character> lst = new ArrayList<Character>();
		Set<Character> settolist = new LinkedHashSet<Character>();
		// String str1 = "When life gives you lemons, make lemonade";
		for (int i = 0; i < str.length(); i++) {
			if (!lst.contains(str.charAt(i))) {
				lst.add(str.charAt(i));
			} else {
				settolist.add(str.charAt(i));
			}
		}
		System.out.println(settolist);
		
		
		
		//Method 4
		Set<Character> charSet1 = new LinkedHashSet<>();
		Set<Character> dupCharSet1 = new LinkedHashSet<>();
		for (int i = 0; i < charArray2.length; i++) {
			for (int j = i + 1; j < charArray2.length; j++) {
				if(charArray2[i] == charArray2[j]) {
						
					dupCharSet1.add(charArray2[i]);
					break;
				}
				charSet1.add(charArray2[i]);
				
			}
		}
	System.err.println(charSet1);
	System.err.println(dupCharSet1);	

	}

}
