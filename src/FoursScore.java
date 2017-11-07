public class FoursScore extends Score {
	private static final String name = "Fours";
	
	public String getName() {
        return name;
    }
	
	public int calculateScore(int[] values) {	
		int sum = 0;
		for (int i = 0; i < values.length; i++) if (values[i] == 4) sum += 4;
		return sum;
	}  
}
