package workout.week1.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CaseCount {
	/**
	 * Write a java program to find the number of Uppercase, lowercase, numbers and
	 * spaces in the following String. Input: "1. It is Work from Home not Work for
	 * Home"
	 * 
	 */
	public static void main(String[] args) {
		String str = "1. It is Work from Home  not Work for Home";
		char[] charArray = str.toCharArray();
		int uc=0,lc=0,dc=0,sc=0;
		System.err.println(charArray);
		for (int i = 0; i < charArray.length; i++) {
			if((int)charArray[i]>65 && (int)charArray[i]<90)
				uc+=1;
			if((int)charArray[i]>97 && (int)charArray[i]<122)
				lc+=1;
			if((int)charArray[i]>48 && (int)charArray[i]<57)
				dc+=1;
			if((int)charArray[i]  == 32)
				sc+=1;
			
		}
		System.err.println(uc + ":" +lc + ":"+dc + ":"+sc);
		
		
		
		
		int upperCount = 0, lowerCount = 0, digitCount = 0, spaceCount = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isUpperCase(charArray[i]))
				upperCount += 1;
			if (Character.isLowerCase(charArray[i]))
				lowerCount += 1;
			if (Character.isDigit(charArray[i]))
				digitCount += 1;
			if (Character.isWhitespace(charArray[i]))
				spaceCount += 1;
		}
		System.out.println(upperCount + ":" + lowerCount + ":" + digitCount + ":" + spaceCount);

		// method 2
		String input = "1. It is Work from Home  not Work for Home";
		System.out.println("Total number of digits: " + input.chars().filter((c) -> Character.isDigit(c)).count());
		System.out.println(
				"Total number of lower case letters :" + input.chars().filter((c) -> Character.isLowerCase(c)).count());
		System.out.println(
				"Total number of UPPER case letters :" + input.chars().filter((c) -> Character.isUpperCase(c)).count());
		System.out.println(
				"Total number of Blank Spaces :" + input.chars().filter((c) -> Character.isSpaceChar(c)).count());

		// method 3
		int count = 0;
		String arrPattern[] = { "[a-z]", "[A-Z]", "\\d", "\\s" ,"\\."};//or [.]
		for (int i = 0; i < arrPattern.length; i++) {
			count = 0;
			Pattern ptn = Pattern.compile(arrPattern[i]);
			Matcher mtch = ptn.matcher(str);
			while (mtch.find()) {
				count += 1;
			}
			System.out.println(arrPattern[i] + ":" + count);
		}

	}

}
