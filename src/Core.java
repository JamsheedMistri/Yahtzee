
public class Core {
	public static boolean confirm(String affirmative, String negative) {
		String s = TextIO.getlnString();
		System.out.println("Invalid input! Please enter \"" + affirmative + "\" or \"" + negative + "\": ");
		while (!s.equals(affirmative) && !s.equals(negative)) s = TextIO.getlnString();
		if (s.equals(affirmative)) return true;
		return false;
	}
}