package workout.week1.day2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfNumbers {
	/**
	 * Write a java code to find the sum of the given numbers Input:
	 * "asdf1qwer9as8d7" output: 1+9+8+7 = 25
	 */
	public static void main(String[] args) {
/*		String str = "asdf1qwer9as8d7";

		// Method 1
		String replaceAll = str.replaceAll("\\D", "");
		System.out.println(replaceAll);
		Integer num = Integer.parseInt(replaceAll);
		System.err.println(num);

		int sum = 0;
		char[] charArray = replaceAll.toCharArray();
		for (int i = 0; i < replaceAll.length(); i++) {
			char charAt = charArray[i];
			sum += Integer.parseInt(String.valueOf(charAt));
		}
		System.err.println(sum);

		// Method 2
		int sum1 = 0;
		char[] charArray1 = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			char charAt = charArray1[i];
			if (Character.isDigit(charAt))
				sum1 = sum1 + Integer.parseInt(String.valueOf(charAt));
		}
		System.out.println("sum" + sum1);
		
		
		//method 3
		String s= "asdf1qwer9as8d7";
		char[] charArray3=s.toCharArray();
		int sum2=0;
		for(int i=0 ; i<charArray3.length;i++) {
			if((int)charArray3[i]>=48 && (int)charArray[i]<=57) {
				sum2+=Character.getNumericValue(charArray3[i]); // to get the actual character /value of the character
				
			}
		}
		
		System.out.println("The sum of numbers in the given string is :"+sum2);*/
		
		
		//method4
		
		String str4 = "asdf1qwer9as8d7";
		int sol = 0;
		String numbers_str = str4.replaceAll("[^0-9]", "");
		System.out.println(numbers_str);
		int sum = numbers_str.chars().sum();
		//System.err.println(sum);
		char[] charArray = numbers_str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
			System.out.println(Character.getNumericValue(charArray[i]));
			sum += Character.getNumericValue(charArray[i]);
		}
		int num4 = Integer.parseInt(numbers_str);
		//System.err.println("num4" + num4);
		while (num4 > 0) {
			sol += num4 % 10;
			num4 /= 10;
		}
		System.out.println(sol);
	}
	



}
