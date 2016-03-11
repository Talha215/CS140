package assignment05;

public class ExtraCheese extends PizzaTopping {

	public ExtraCheese(Pizza p) {
		super(p);
	}

	@Override
	public double getCost() {
		return 0.30 + getOn().getCost();
	}

}
