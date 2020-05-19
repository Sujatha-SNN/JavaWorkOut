package workout.week2.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PrintList {

	public static void main(String[] args) {

		String str = "Bugatti Chiron";
		char[] charArray = str.toCharArray();
		List<Character> lst = new ArrayList<Character>();
		HashMap<Integer, Character> smap = new HashMap<Integer, Character>();
		for (int i = 0; i < charArray.length; i++) {
			lst.add(i, charArray[i]);
			smap.put(i, charArray[i]);
		}
		
		
		for (int i = 0; i < lst.size(); i++) {
			System.out.print(lst.get(i));
			
		}
		
		for (Character character : lst) {
			
			System.out.print(character);
		}
		
		
		for (Iterator<Character> iterator = lst.iterator(); 
				iterator.hasNext();) {
			Character character = (Character) iterator.next();
			System.out.print(character);
		}
		
		Iterator<Character> iterator = lst.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}

		Iterator<Character> iterator1 = lst.listIterator();
		while(iterator1.hasNext()) {
			System.err.print(iterator1.next());
		}
		
		int c=0;
		while(c<lst.size())
		{
			System.out.print(lst.get(c));
			c++;
		}
		/*System.out.println(lst);
		System.out.println(smap.values());
		System.out.println(Arrays.toString(lst.toArray()));
		System.out.println(Arrays.toString(charArray));*/
		// lst.stream().forEach(System.out::println);

	}

}
