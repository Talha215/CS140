package assignment05;

public class SmallCheesePizza implements Pizza {

	@Override
	public int compareTo(Pizza arg0) {
		return 1;
	}

	@Override
	public String getDescription() {
		return "Small cheese pizza";
	}

	@Override
	public double getCost() {
		return 8.0;
	}
	
}
