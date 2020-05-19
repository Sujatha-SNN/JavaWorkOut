package workout.week2.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ReverseMap {

	public static void main(String[] args) {
		Map<Integer,String> empMap = new LinkedHashMap<>();
		Map<Integer,String> sortedempMap = new TreeMap<>();
		
		empMap.put(100,"Hari");
		empMap.put(101,"Naveen");
		empMap.put(104,"Balaji");
		empMap.put(102,"Sam");
		empMap.put(105, null);
		empMap.put(106, null);
		List<Integer> list = new ArrayList<>(empMap.keySet());
		for (int i =list.size()-1; i >0 ; i--) {
			System.out.println(list.get(i) + " : " + empMap.get(list.get(i)));
		}
		sortedempMap.putAll(empMap);
		System.err.println(sortedempMap);
	
		
		
	}

}
