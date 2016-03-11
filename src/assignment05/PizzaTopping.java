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
		String s = getClass().getSimpleName();
		
		if(on instanceof PizzaTopping)
			s += ", " + on.getDescription();
		else
			s += " on " + on.getDescription();
		
		return s;
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
