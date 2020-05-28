package workout.week3.day4;

public class FibonacciSeries {

	public static void main(String[] args) {
		int arr[] = new int[10];

		int n1 = 0, n2 = 1, n3 = 0;
		int count = 10;
		while (count > 0) {

			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
			count--;
			arr[count] = n3;
		}
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("*" + arr[i]);
		}

	}
}
