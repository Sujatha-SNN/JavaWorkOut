package workout.week3.day3;

import java.util.Arrays;
import java.util.HashMap;


public class DuplicateElementinArray {

	public static void main(String[] args) {
		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };
		//Method 1
		Arrays.sort(my_array);
		for (int i = 0; i < my_array.length - 1; i++) {
			if (my_array[i] == my_array[i + 1]) {
				System.out.println(my_array[i]);
			}
		}
		
		//Method 2
		for (int i = 0; i < my_array.length; i++) {
			for (int j = i+1; j < my_array.length; j++) {
				if (my_array[i] == my_array[j]) {
					System.out.println(my_array[i]);
				}
			}
		}
		
		//Method 3
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < my_array.length; i++) {
			if (hmap.containsKey(my_array[i])) {
				hmap.put(my_array[i], hmap.get(my_array[i]) + 1);
				System.out.println("Duplicate Element" + my_array[i]);
			} else {
				hmap.put(my_array[i], 1);
			}
		}
	}
}