package september;

import java.util.HashMap;
import java.util.Map;

public class CheckforACharacter {

	public static void main(String[] args) {
		char c = 't';
		String str = "Im a self-motivated person";
		char[] charArr = str.toCharArray();
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		for(int i = 0;i<charArr.length;i++)
		{
			if(hmap.containsKey(charArr[i]))
			{
				hmap.put(charArr[i], hmap.get(charArr[i])+1);
				
			}
			else
				hmap.put(charArr[i], 1);
		}
		
		System.out.println(hmap);
		for (Character charCheck : hmap.keySet()) {
			
			if(charCheck == c)
				System.out.println(hmap.get(charCheck));
			
		}

	}

}
