package august;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStringWithSpacesRetained {

	public static void main(String[] args) {
		// String str = "India is a wonderful country";
		String str = "Time and Tide waits for none";
		int spaceCount = str.replaceAll("\\S", "").length();
		System.out.println("count" + spaceCount);
		char[] charArray = str.toCharArray();
		// Print the original string
		System.out.println(Arrays.toString(charArray));

		int[] arraySpaces = new int[spaceCount];
		int j = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				arraySpaces[j] = i;
				j++;
			}
		}

		ArrayList<Character> list = new ArrayList<Character>();

		// Print indexes of ' '
		System.out.println(Arrays.toString(arraySpaces));

		for (int i = charArray.length - 1; i >= 0; i--) {
			if (charArray[i] != ' ')
				list.add(charArray[i]);
		}

		for (j = 0; j < arraySpaces.length; j++) {
			list.add(arraySpaces[j], ' ');
		}
		// Print after reverse with spaces as the original string
		System.out.println(list);

		
	}
}
