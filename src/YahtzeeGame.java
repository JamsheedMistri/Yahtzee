public class YahtzeeGame {
	private YahtzeeDice d = new YahtzeeDice();
	private int totalScore = 0;
	private Score[] scoreboard = {new OnesScore(), new TwosScore(), new ThreesScore(), new FoursScore(), new FivesScore(), new SixesScore(), new ThreeOfAKindScore(), new FourOfAKindScore(), new FullHouseScore(), new SmallStraightScore(), new LargeStraightScore(), new ChanceScore(), new YahtzeeScore()};
	private int turn = 0;
	
	public void startGame() {
		System.out.println("Welcome to Yahztee! Hit enter to begin.");
		TextIO.getln();
		for (int i = 0; i < scoreboard.length; i ++) {
			playTurn();
		}
		endGame();
	}
	
	public void playTurn() {
		turn ++;
		d.resetDice();
		System.out.println("Starting round " + turn + " out of " + scoreboard.length + ".\nYou have a maximum of 3 turns per round.");
		for (int i = 2; i > 0; i --) {
			System.out.println("Rolling...");
			d.rollUnselected();
			System.out.print("The five dice read: " + d.toString() + "\nYou have " + i + " turns left in this round.\nWould you like to roll again? (y/n): ");
			if (Core.confirm("y", "n")) {
				chooseDice();
				if (i == 1) System.out.println("The five dice read: " + d.toString());
				continue;
			}
			else break;	
		}
		score();
	}
	
	public void chooseDice() {
		for (int i = 0; i < YahtzeeDice.NUM_OF_DICE; i ++) {
			if (!d.getDice()[i].isSelected()) {
				System.out.print("Hold dice #" + (i + 1) + "? (y/n): ");
				if (Core.confirm("y", "n")) d.selectDice(i);
			}
		}
	}
	
	public void score() {
		for (int i = 0; i < scoreboard.length; i ++) scoreboard[i].setCurrentValue(scoreboard[i].calculateScore(d.getDiceValues()));
		System.out.println("\n========== CURRENT SCOREBOARD ==========");
		for (int i = 0; i < scoreboard.length; i ++) {
			if (scoreboard[i].isSelected) System.out.print(scoreboard[i].getName() + " (" + (i + 1) + "): " + scoreboard[i].getCurrentValue());
			else System.out.print(scoreboard[i].getName() + " (" + (i + 1) + "): 0");
			
			if ((i + 1) % 5 == 0) System.out.print("\n");
			else System.out.print("     ");
		}
		
		System.out.println("\n\n========== POTENTIAL SCOREBOARD ==========");
		for (int i = 0; i < scoreboard.length; i ++) {
			if (!scoreboard[i].isSelected) System.out.print(scoreboard[i].getName() + " (" + (i + 1) + "): " + scoreboard[i].getCurrentValue());
			
			if ((i + 1) % 5 == 0) System.out.print("\n");
			else System.out.print("     ");
		}
		
		System.out.print("\n\nWhich would you like to keep? (choose number in parenthasis): ");
		int answer = TextIO.getlnInt();
		while (answer < 1 || answer > 13) {
			System.out.print("\nThat is not a valid number. Please choose a number in the parenthasis: ");
			answer = TextIO.getlnInt();
		}
		
		while (!scoreboard[answer - 1].select()) {
			System.out.print ("You have already chosent this! Please try again. Enter a number: ");
			answer = TextIO.getlnInt();
		}
		
		totalScore += scoreboard[answer - 1].getCurrentValue();
		System.out.println("You picked " + scoreboard[answer - 1].getName() + "! Your total score has gone up by " + scoreboard[answer - 1].getCurrentValue() + " to a new total of " + totalScore + ".\n");
	}
	
	public void endGame() {
		System.out.println("Congratulations! You finished all 13 rounds of Yahtzee and scored a total score of " + totalScore + ".");
	}
}
