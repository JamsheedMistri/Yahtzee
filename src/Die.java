public class Die {
	
	private int numSides;
	private int currentValue;
	private boolean selected = false;
	
	public Die() {
		numSides = 6;
		roll();
	}
	
	public Die(int sides) {
		numSides = sides;
		roll();
	}

	public Die(int sides, int initialValue) {
		numSides = sides; 
		currentValue = initialValue;
	}
	
	public int roll() {
		currentValue = (int)(Math.random() * numSides + 1);
		return currentValue;
	}
	
	public String toString() {
		return "Num of sides: " + numSides + ", Value: " + currentValue;
	}
	
	public int getCurrentValue() {
		return currentValue;
	}
	
	public void select() {
		selected = true;
	}
	
	public void unselect() {
		selected = false;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
}