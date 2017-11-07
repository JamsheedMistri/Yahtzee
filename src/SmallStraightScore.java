public class SmallStraightScore extends Score {
	private static final String name = "Small Straight";
	
	public String getName() {
        return name;
    }
	
	public int calculateScore(int[] values) {	
		int[] numsOfEach = new int[] {(new OnesScore()).calculateScore(values), (new TwosScore()).calculateScore(values) / 2, (new ThreesScore()).calculateScore(values) / 3, (new FoursScore()).calculateScore(values) / 4, (new FivesScore()).calculateScore(values) / 5, (new SixesScore()).calculateScore(values) / 6};
		
		int numOfZeros = 0;
		for (int i = 0; i < values.length; i++) if (numsOfEach[i] == 0) numOfZeros ++;
		
		if(numOfZeros > 1) return 0;
		else return 30;
	} 
}
