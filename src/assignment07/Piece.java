package assignment07;

import java.util.List;

public class Piece extends Product {
	double cost, manufactureTime;	
	
	public Piece(String description, double cst, double mTime) {
		super(description);
		cost = cst;
		manufactureTime = mTime;
	}
	
	public void addAllParts(int indent, List<Product> list) {
		setIndent(indent);
	}
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getManufactureTime() {
		return manufactureTime;
	}

	public void setManufactureTime(double manufactureTime) {
		this.manufactureTime = manufactureTime;
	}
}
