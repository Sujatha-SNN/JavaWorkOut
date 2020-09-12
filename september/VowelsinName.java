package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelsinName {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 
      
     // Reading data using readLine 
     String name = reader.readLine(); 
     int length = name.replaceAll("[^aeiou]", "").length();
     System.out.println(length);
	}

}
