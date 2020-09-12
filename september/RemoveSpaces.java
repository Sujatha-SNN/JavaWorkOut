package september;

public class RemoveSpaces {

	public static void main(String[] args) {
		// Using Console to input data from user 
      //  String name = System.console().readLine();
		String name = " fgh	";
        System.out.println(name);
        name.replaceAll("^[ \t]+|[ \t]+$", "");
        System.out.println(name);
		

	}

}
