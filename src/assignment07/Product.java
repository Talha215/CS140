package assignment07;

public abstract class Product {
	
	public void setCost(double cost) {
		throw new UnsupportedOperationException("Method setCost cannot be "
				+ "called on this object");
	}
}
