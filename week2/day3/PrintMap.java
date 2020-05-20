package workout.week2.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintMap {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('A', 1);
		map.put('B', 2);
		map.put('C', 3);
		map.put('D', 4);
		map.put('E', 5);
		//Method 6
		map.forEach((eachKey,eachValue) -> System.out.println(eachKey+ "->" + eachValue)); //Lambda expression
		
		//Method 1
		Set<Character> set = new HashSet<>(map.keySet());
		List<Character> lst = new ArrayList<>(set);
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i) + "->" + map.get(lst.get(i)));
		}

		//Method 2
		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}

		//Method 3
		// Get the iterator over the HashMap
		Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
		// Iterate over the HashMap
		while (iterator.hasNext()) {
			// Get the entry at this iteration
			Map.Entry<Character, Integer> entry = iterator.next();
			System.err.println(entry.getKey() + "->" + entry.getValue());

		}

		//Method 4
		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
		//Method 5
		int c=0;
		while(c<map.size())
		{
			System.err.println(lst.get(c) + "->" + map.get(lst.get(c)));
			c++;
		}
		
//iterator interface-- foreachremaining 
//iterable interface -- foreach lambda
		
	}
}

