package workout.week1.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. Write a java program to verify whether the given String is valid email address.
Input: "balaji.chandrasekaran@testleaf.com"
output: true
Input: "balaji.c@tunatap.co.uk"
output: true
Input: "naveen e@tl.com"
output: false
Note: Spl characters like . _ are only allowed

 * @author NethraNandhana
 *
 */


public class ValidateEmailAddress {
	public static void main(String[] args) {
		String str = "naveen.e@tl.com";
		//Pattern ptn = Pattern.compile("[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}");
		Pattern ptn = Pattern.compile("[a-zA-Z\\d._]+@[a-z\\d]+.[a-z.]{2,}");
		Matcher mtch = ptn.matcher(str);
		System.err.println(mtch.matches());
	}
}
