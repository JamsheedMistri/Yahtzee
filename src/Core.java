
public class Core {
	public static boolean confirm(String affirmative, String negative) {
		String s = TextIO.getlnString();
		while (!s.equals(affirmative) && !s.equals(negative)) {
			System.out.println("Invalid input! Please enter \"" + affirmative + "\" or \"" + negative + "\": ");
			s = TextIO.getlnString();
		}
		if (s.equals(affirmative)) return true;
		return false;
	}
}