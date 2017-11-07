public class YahtzeeDice {

	public static final int NUM_OF_DICE = 5; 
	
	private Die[] dice = new Die[NUM_OF_DICE]; 

	public YahtzeeDice() {  
		for(int i = 0; i < NUM_OF_DICE; i++) {
			dice[i] = new Die(); 
		}
	}


	public YahtzeeDice(int numSides) {
		for(int i = 0; i < NUM_OF_DICE; i++) {
			dice[i] = new Die(numSides); 
		}
	}
	
	public void resetDice() {
		for (int i = 0; i < dice.length; i ++) {
			dice[i].unselect();
		}
	}
	
	public int roll() { 
		int sum = 0;

		for(int i = 0; i < NUM_OF_DICE; i++) {
			sum += dice[i].roll();
		}
		return sum;
	}
	
	public void rollUnselected() {
		for (int i = 0; i < NUM_OF_DICE; i ++) {
			if (!dice[i].isSelected()) dice[i].roll();
		}
	}
	
	public int getNumberOfUnselected() {
		int number = 0;
		for (int i = 0; i < NUM_OF_DICE; i ++) {
			if (!dice[i].isSelected()) number ++;
		}
		return number;
	}
	
	public Die[] getUnselected() {
		int index = 0;
		Die[] dieArray = new Die[getNumberOfUnselected()];
		for (int i = 0; i < getDice().length; i ++) {
			if (!dice[i].isSelected()) {
				dieArray[index] = dice[i];
				index ++;
			}
		}
		return dieArray;
	}
	
	public String getUnselectedString() {
		String s = "";
		for (int i = 0; i < getUnselected().length; i ++) {
			s += getUnselected()[i].getCurrentValue();
			if (i != getUnselected().length - 1) s += ", ";
		}
		return s;
	}
	
	public void selectDice(int index) {
		dice[index].select();
	}
	
	public Die[] getDice() {  
		return dice;
	}
	
	public int[] getDiceValues() {  
		int[] diceValues = new int[NUM_OF_DICE];
		for(int i = 0; i < dice.length; i++) {
			diceValues[i] = dice[i].getCurrentValue(); 
		}
		return diceValues;
	}
	
	public String toString() {
		String yahtzee = "";
		
		for(int i = 0; i < dice.length; i++) {
			if(i < dice.length - 1)	
				yahtzee += dice[i].getCurrentValue() + ", ";
			else
				yahtzee += dice[i].getCurrentValue() + ".";
		}
		return yahtzee;
	}

}