package workout.week1.day4;

public class StringConcepts {
	/**
	 * 1.Why string is immutable In java, string objects are immutable. Immutable
	 * simply means unmodifiable or unchangeable. Once string object is created its
	 * data or state can't be changed but a new string object is created.
	 * 
	 * 2.Why string objects are immutable in java? Because java uses the concept of
	 * string literal.Suppose there are 5 reference variables,all referes to one
	 * object "sachin".If one reference variable changes the value of the object, it
	 * will be affected to all the reference variables. That is why string objects
	 * are immutable in java.
	 * 
	 * 3.Why The string is Immutable in Java because String objects are cached in
	 * 
	 * String pool. ... Another reason of why String class is immutable could die
	 * due to HashMap. Since Strings are very popular as HashMap key, it's important
	 * for them to be immutable so that they can retrieve the value object which was
	 * stored in HashMap.
	 * 
	 * 4.Why Java uses the concept of String literal? 
	 * To make Java more memory
	 * efficient (because no new objects are created if it exists already in the
	 * string constant pool).
	 * 
	 * 5.What is intern () in Java? 
	 * The java string intern() method returns the
	 * interned string. It returns the canonical representation of string. It can be
	 * used to return string from memory, if it is created by new keyword. It
	 * creates exact copy of heap string object in string constant pool.
	 * 
	 * 6.How to make Strings mutable?
	 * use StringBuffer / StringBuilder class
	 * 
	 * What will happen when you concatenate two Strings?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Java";
		String concat = str.concat("world");
		System.out.println(str + "" + concat);
		
		String str1="java";
		String concat2 = str1.concat("K");
		String str2="java";
		str2.concat("K");
		System.out.println(str1==str2);//same memory location is in str1 and str2 
		//String is not created
		/*String objects are c reated in Heap Memory and String literals in String literal pool */
		String str3=new String("java");
		String str4=new String("java");
	}

}
