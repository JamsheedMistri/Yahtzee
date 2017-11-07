public class FourOfAKindScore extends Score {
	private static final String name = "Four of a Kind";
	
	public String getName() {
        return name;
    }
	
	public int calculateScore(int[] values) {	
		int sum = 0;
		for (int i = 0; i < values.length; i++) sum += values[i];
		if ((new OnesScore()).calculateScore(values) >= 4 || (new TwosScore()).calculateScore(values) / 2 >= 4 || (new ThreesScore()).calculateScore(values) / 3 >= 4 || (new FoursScore()).calculateScore(values) / 4 >= 4 || (new FivesScore()).calculateScore(values) / 5 >= 4 || (new SixesScore()).calculateScore(values) / 6 >= 4) return sum;
		return 0;
	} 
}
