public class ThreeOfAKindScore extends Score {
	private static final String name = "Threes";
	
	public String getName() {
        return name;
    }
	
	public int calculateScore(int[] values) {	
		int sum = 0;
		for (int i = 0; i < values.length; i++) sum += values[i];
		if ((new OnesScore()).calculateScore(values) >= 3 || (new TwosScore()).calculateScore(values) / 2 >= 3 || (new ThreesScore()).calculateScore(values) / 3 >= 3 || (new FoursScore()).calculateScore(values) / 4 >= 3 || (new FivesScore()).calculateScore(values) / 5 >= 3 || (new SixesScore()).calculateScore(values) / 6 >= 3) return sum;
		return 0; 
	} 
}

