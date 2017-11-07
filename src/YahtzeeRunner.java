
public class YahtzeeRunner {
	public static void main(String[] args) {
		while (true) {
			YahtzeeGame g = new YahtzeeGame();
			g.startGame();
			System.out.print("Hit enter to play again.");
			TextIO.getln();
		}
	}
}
