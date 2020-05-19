package workout.week2.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupFromList {
	/*
	 * 1. How to remove duplicates from a list? List = "A,B,C,D,A,D,E,F" 2. How to
	 * retrieve a value from a Set? Set = "1,2,3,4,5,6,7,8,9" retrieve and print
	 * only the value - 7
	 */

	public static void main(String[] args) {
		List<Character> lst = new ArrayList<Character>();
		List<Character> copylst = new ArrayList<Character>();
		lst.add('A');
		lst.add('B');
		lst.add('C');
		lst.add('D');
		lst.add('A');
		lst.add('D');
		lst.add('E');
		lst.add('F');
		//Method1
		Set<Character> uniqueSet = new LinkedHashSet<Character>(lst);
		System.err.println(uniqueSet);
		
		//Method2
		for (int i = 0; i < lst.size(); i++) {

			if (!copylst.contains(lst.get(i))) {
				copylst.add(lst.get(i));
			}
		}
		System.out.println(copylst);


	}

}
