public class FullHouseScore extends Score {
	private static final String name = "Full House";
	
	public String getName() {
        return name;
    }
	
	public int calculateScore(int[] values) {	
		int[] numsOfEach = new int[] {(new OnesScore()).calculateScore(values), (new TwosScore()).calculateScore(values) / 2, (new ThreesScore()).calculateScore(values) / 3, (new FoursScore()).calculateScore(values) / 4, (new FivesScore()).calculateScore(values) / 5, (new SixesScore()).calculateScore(values) / 6};
		boolean yesTwos = false;
		boolean yesThrees = false;
		for (int i = 0; i < numsOfEach.length; i++) {
			if (numsOfEach[i] == 2) yesTwos = true;
			else if (numsOfEach[i] == 3) yesThrees = true;
		}
		if (yesTwos && yesThrees) return 25;
		else return 0;
	} 
}
