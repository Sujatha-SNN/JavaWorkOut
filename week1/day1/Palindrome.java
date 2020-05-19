package workout.week1.day1;

public class Palindrome {
	public static void main(String[] args) {
		//First Aproach
		StringBuffer str = new StringBuffer("malayalam");
		StringBuffer str1 = str.reverse();
		// StringBuffer and String can not be compared.. -- StringBuffer has to
		// converted to String using toString()
		if (str.toString().equals(str1.toString()))
			System.out.println("Palindrome");
		else
			System.err.println("Not a palindrome");

		// Second Approach
		String inpStr = "testleaf";
		char[] charArray = inpStr.toCharArray();
		char[] charArray1 = new char[15];
		for (int i = charArray.length - 1, j = 0; i >= 0; j++, i--) {
			charArray1[j] = charArray[i];
		}
		if (String.valueOf(charArray1).equals(String.valueOf(charArray)))
			System.err.println("palindrome");
		else
			System.out.println("Not a palindrome");
		
		
		//third approach
		String inputString = "testleaf";
		boolean flag = false;
		int j = inputString.length() - 1;
		for (int i = 0; i < inputString.length(); i++) {
			char charAt = inputString.charAt(i);
			char charAt2 = inputString.charAt(j);
			if (charAt == charAt2) {
				if (j != 0) {
					flag = true;
					j--;
					continue;
				}
			} else {
				if (j != 0)
					j--;
				flag = false;

			}
		}
		if (flag)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
		
		/*// Method 1: Using String object to convert char Array to String
	      char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
	      String strr = new String(ch);
	      System.out.println(strr);
	 
	      // Method 2: Using valueOf method to convert char Array to String
	      String str2 = String.valueOf(ch);
	      System.out.println(str2);
	      	System.err.println(strr.equals(str2)?"yes":"no"); // ternary operator
	      if(strr.equals(str2))
	    	  System.err.println("same");*/
	}
	
	
	
}
