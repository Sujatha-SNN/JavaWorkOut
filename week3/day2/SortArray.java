package workout.week3.day2;

import java.util.Arrays;

/**
 * 1. What is an array? How to Create an array? 2. Write a java program to sort
 * it and reverse it. Input: int[] array = {5,1,33,79,22,11,45}; output: Sorted:
 * {1,5,11,22,33,45,79} reversed: {79,45,33,22,11,5,1} 3. Write a java program
 * to find the average of the numbers in an arrray. input: int[] array= {20, 30,
 * 25, 35, -16, 60, -100}; output: Average: 7 4. Write a java program to print
 * the common numbers in between the two arrays. int[] array1 = { 1, 2, 5, 5, 8,
 * 9, 7, 10 }; int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
 * 
 * @author NethraNandhana
 *
 */
public class SortArray {

	public static void main(String[] args) {
		//int[] array = { 5, 1, 33, 79, 22, 11, 45 };
		int[] array1 = new int[7];
/*		//Method 1
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}*/
		int[] array = { 6,2,5 };
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(array));

		//Method 2
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		for (int i = array.length - 1, j = 0; i >= 0; j++, i--) {
			array1[j] = array[i];
		}
		System.out.println(Arrays.toString(array1));

	}

}
