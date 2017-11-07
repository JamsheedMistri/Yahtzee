public class TwosScore extends Score {
	private static final String name = "Twos";
	
	public String getName() {
        return name;
    }
	
	public int calculateScore(int[] values) {	
		int sum = 0;
		for (int i = 0; i < values.length; i++) if (values[i]== 2) sum += 2;
		return sum;
	} 
}