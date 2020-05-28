package workout.week3.day2;

import java.util.Arrays;

public class AvginArray {

	public static void main(String[] args) {
		int[] arrInt = {20, 30, 25, 35, -16, 60, -100};
		//Method 1
		int sum=0;
		for (int i = 0; i < arrInt.length; i++) {
			if(arrInt[i]>0)
				System.out.println(arrInt[i]);
			sum  += arrInt[i]; 
		}
		int avg = sum/arrInt.length;
		System.out.println(avg);
		
		//Method 2 
		int sum2 = Arrays.stream(arrInt).sum();
		System.out.println(sum2/7);
	}
}
