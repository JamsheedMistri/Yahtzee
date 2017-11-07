
public abstract class Score {
	protected int currentValue;
	public abstract String getName();
	protected boolean isSelected = false;
	public abstract int calculateScore(int[] values);
	
	public int getCurrentValue() {
		return currentValue;
	}
	
	public boolean select() {
		if (isSelected) return false;
		isSelected = true;
		return true;
	}
	
	public boolean setCurrentValue(int a) {
		if (isSelected) return false;
		currentValue = a;
		return true;
	}
}

