package workout.week1.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 2. Write a java program to validate the given username is valid or not
Input: "Balaji_1"
output: false
Input: "Testleaf$123"
output: false
Note: 
1. It should contain minimum 8 characters.
2. It allows alpha numeric characters and spl characters like . _ @ $
 * @author NethraNandhana
 *
 */
public class ValidateUserName {
	public static void main(String[] args) {
		String str1 = "Testleaf!!";
		//Pattern ptn1 = Pattern.compile("[a-zA-Z0-9._$@]{8,}");
		Pattern ptn1 = Pattern.compile("[a-zA-Z\\d._$@]{8,}");
		Matcher mtch1 = ptn1.matcher(str1);
		System.out.println(mtch1.matches());
	}
}
