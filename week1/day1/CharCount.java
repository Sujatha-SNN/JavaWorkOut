package workout.week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;

public class CharCount {
	/**
	 * Find the occurrence count of character 'o'
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		
		String str = "You have no choice other than following me!";
		// Method 1
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (hmap.containsKey(charArray[i])) {
				hmap.put(charArray[i], hmap.get(charArray[i]) + 1);
			} else {
				hmap.put(charArray[i], 1);
			}
		}
		System.out.println(hmap.get('o'));

		// Method 2
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'o') // str.charAt(i)=='o'
			{
				count = count + 1;
			}
		}
		System.out.println(count);

		// Method 3 -using Stream Filters and lambda expressions
		System.out.println(str.chars().filter(i -> i == 'o').count());
		int count1 = StringUtils.countMatches(str, "o");// Using External Libraries
		System.err.println(count1);

		// Regex approach- Learnt during session
		String strregex = str.replaceAll("[^o]", "");
		System.err.println(strregex.length());
		
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a String : ");
		String stringInput=br.readLine();
		System.out.println("Please enter the character to be found :");
		char chartoCount=br.readLine().charAt(0);
		char[] charArray2=stringInput.toCharArray();
		int countOfChar=0;
		for(int i=0; i<charArray2.length;i++) {
			if(charArray2[i]==chartoCount) {
				countOfChar+=1;
			}
		}
		
		System.out.println("The number of '"+chartoCount+ "' in the given string is : "+countOfChar);

	}

}
