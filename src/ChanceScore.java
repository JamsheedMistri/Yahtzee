public class ChanceScore extends Score {
	private static final String name = "Chance";
	
	public String getName() {
        return name;
    }
	
	public int calculateScore(int[] values) {	
		int sum = 0;
		for (int i = 0; i < values.length; i++) sum += values[i];
		
		return sum;
	}
}
