public class ThreesScore extends Score {
	private static final String name = "Threes";
	
	public String getName() {
        return name;
    }
	
	public int calculateScore(int[] values) {	
		int sum = 0;
		for(int i = 0; i < values.length; i++) if (values[i]== 3) sum += 3;
		return sum;
	} 
}