package workout.week1.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a java program to do the following. Input: "When the world realise
 * its own mistake, corona will dissolve automatically" output: "When eht world
 * esilaer its nwo mistake, anoroc will evlossid automatically"
 *
 */
public class Reversealtwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "When the world realise its own mistake, corona will dissolve automatically";
		// Method 1
		String[] split = str.split("\\s");
		StringBuffer strbuf = new StringBuffer();
		for (int i = 0; i < split.length; i++) {
			if (i % 2 != 0)
				strbuf.append(" ").append(new StringBuffer(split[i]).reverse());
			else
				strbuf.append(" ").append(new StringBuffer(split[i])).append(" ");
		}
		System.out.println(strbuf);

		// Method 2
		List<String> strs = new ArrayList<String>();
		Pattern ptn = Pattern.compile("(\\w+\\,*)");
		Matcher mtch = ptn.matcher(str);

		while (mtch.find()) {
			strs.add(mtch.group());
		}
		System.err.println(strs);
		StringBuffer strBuf = new StringBuffer();
		String valueOf = "";
		for (int i = 0; i < strs.size(); i++) {
			if (i % 2 == 0)
				strBuf.append(strs.get(i));
			if (i % 2 != 0) {
				valueOf = "";
				for (int j = strs.get(i).length() - 1; j >= 0; j--) {
					valueOf = valueOf + strs.get(i).charAt(j);
				}
				strBuf.append(" " + valueOf + " ");
			}
		}
		System.out.println(strBuf);

	}

}
