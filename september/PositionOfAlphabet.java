package september;

import java.util.Scanner;

public class PositionOfAlphabet {

	public static void main(String[] args) {
		String str = "Better late than never";
		char c = 'e';
		System.out.println(str.length());
		for(int i =0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
				System.out.println(i);
		}
		
		//Position of english alphabets in the set
		Scanner sc = new Scanner(System.in);
		char aplhaChar = sc.next().toLowerCase().charAt(0);
		int charAscii = (int)aplhaChar;
		int position = charAscii - 96;
		System.out.println(position);
		
		
		
	}}
		