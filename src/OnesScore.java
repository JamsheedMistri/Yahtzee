public class OnesScore extends Score {
	private static final String name = "Ones";
	
	public String getName() {
        return name;
    }
	
	public int calculateScore(int[] values) {	
		int sum = 0;
		for (int i = 0; i < values.length; i++) if (values[i] == 1) sum += 1;
		return sum;
	} 
}
