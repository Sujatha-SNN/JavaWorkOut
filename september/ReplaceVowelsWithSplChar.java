package september;

public class ReplaceVowelsWithSplChar {

	public static void main(String[] args) {
		String name = "Sujatha";
		name =name.replaceAll("[aeiou]", "#");
		System.out.println(name);

	}

}
