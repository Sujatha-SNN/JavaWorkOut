package workout.week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintCommonNumsinArrays {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		//Method 1
		Arrays.sort(array1);
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array1));
		System.err.println(Arrays.toString(array2));
		Set<Integer> set1 = new LinkedHashSet<>();
		Set<Integer> set2 = new LinkedHashSet<>();
		for (int i = 0; i < array1.length; i++) {
			set1.add(array1[i]);
		}
		for (int i = 0; i < array2.length; i++) {
			set2.add(array2[i]);
		}

		System.out.println(set1);
		System.out.println(set2);

		for (Integer integer : set2) {
			if (set1.contains(integer))
				System.out.println(integer);
		}
		
		//method 2
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j])
				System.out.println(array1[i]);
				
			}
			
		}

	}

}
