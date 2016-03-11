package assignment05;

public abstract class PizzaTopping implements Pizza {
	private Pizza on;
	
	public PizzaTopping(Pizza p) {
		on = p;
	}
	
	public Pizza getOn() {
		return on;
	}

	public void setOn(Pizza on) {
		this.on = on;
	}

	public String getDescription() {
		return getClass().getSimpleName() + " on " + on.getDescription();
	}
	
	public int compareTo(Pizza p) {
		int retVal = 0;
		
		if(p instanceof PizzaTopping)
			retVal = getClass().getSimpleName().compareTo(p.getClass().getSimpleName());
		else
			retVal = -1;
		
		return retVal;
	}
}
