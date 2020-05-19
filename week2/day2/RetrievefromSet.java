package workout.week2.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*2. How to retrieve a value from a Set?
		Set = "1,2,3,4,5,6,7,8,9"
		retrieve and print only the value - 7
*/
public class RetrievefromSet {
	public static void main(String[] args) {
		Set<Integer> ss = new LinkedHashSet<>();

		ss.add(1);
		ss.add(2);
		ss.add(3);
		ss.add(4);
		ss.add(5);
		ss.add(6);
		ss.add(7);
		ss.add(8);
		ss.add(9);

		//Method 3
		ss.forEach((eachNum) -> {
			if (eachNum == 7)
				System.out.println(eachNum);
		});

		//Method 1
		List<Integer> lst = new ArrayList<>(ss);
		for (int i = 0; i < lst.size(); i++) {
			if (lst.contains(7)) {
				System.out.println(lst.indexOf(7) + ": " + lst.get(lst.indexOf(7)));
				break;
			}
		}

		//Method 2
		for (Integer integer : ss) {
			if (integer.equals(7))
				System.out.println(integer);

		}

	}
}
