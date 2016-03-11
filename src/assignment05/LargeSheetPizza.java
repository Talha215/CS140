package assignment05;

public class LargeSheetPizza implements Pizza {

	@Override
	public int compareTo(Pizza arg0) {
		return 1;
	}

	@Override
	public String getDescription() {
		return "Large sheet pizza";
	}

	@Override
	public double getCost() {
		return 16.0;
	}
	
}
