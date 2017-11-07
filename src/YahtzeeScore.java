public class YahtzeeScore extends Score {
	private static final String name = "Yahtzee";
	
	public String getName() {
        return name;
    }
	
	public int calculateScore(int[] values) {	
		int sum = 50;
		if ((new OnesScore()).calculateScore(values) >= 5 || (new TwosScore()).calculateScore(values) / 2 >= 5 || (new ThreesScore()).calculateScore(values) / 3 >= 5 || (new FoursScore()).calculateScore(values) / 4 >= 5 || (new FivesScore()).calculateScore(values) / 5 >= 5 || (new SixesScore()).calculateScore(values) / 6 >= 5) return sum;
		return 0;
	}
}
