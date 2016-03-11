package assignment05;

public class Sausage extends PizzaTopping {

	public Sausage(Pizza p) {
		super(p);
	}

	@Override
	public double getCost() {
		return 0.45 + getOn().getCost();
	}

}
