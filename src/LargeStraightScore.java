public class LargeStraightScore extends Score {
	private static final String name = "Large Straight";
	
	public String getName() {
        return name;
    }
	
	public int calculateScore(int[] values) {	
		int output = 40; 
		for (int i = 0; i < values.length - 1; i++) {
			if (values[i] + 1 != values[i + 1]){
				output = 0;
				break;
			}
		}	
		
		return output;
	}
}
