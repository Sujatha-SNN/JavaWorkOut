package september;

import java.util.Scanner;

public class GetNumbersFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String replaceAll = str.replaceAll("\\D", "");
		System.err.println("replacedStr"  +replaceAll);
		char[] charArray = replaceAll.toCharArray();
		int i = 0;
		
		for (char c : charArray) {
			
			i = i+ Character.getNumericValue(c);;
			System.out.println(i);
		}

	}

}
