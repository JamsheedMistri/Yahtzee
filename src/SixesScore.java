public class SixesScore extends Score {
	private static final String name = "Sixes";
	
	public String getName() {
        return name;
    }
	
	public int calculateScore(int[] values) {	
		int sum = 0;
		for (int i = 0; i < values.length; i++) if (values[i] == 6) sum += 6;
		return sum;
	} 
}
