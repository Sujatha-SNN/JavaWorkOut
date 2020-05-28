package workout.week3.day4;
/**
 * 1. Write a java program to swap two numbers
Input: a = 5, b= 10
output: a = 10, b = 5
(Note: Try without the third variable)
2. Print the first 10 fibonacci numbers in reverse order
output: 34,21,13,8,5,3,2,1,1,0
3. Print the armstrong numbers between 1 and 1000.

 * @author NethraNandhana
 *
 */
public class SwapNumbers {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int arr[]= {a,b};
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("b=" + b + "->" + "a=" + a);
	}

}
