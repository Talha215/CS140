package assignment07;

import java.util.List;

/**
 * Piece is a type of Product.
 * This version of Product is like the most basic version of a singular product.
 * Each piece has a cost and manufactureTime that define what the piece costs or how long it takes to produce.
 * @author Talha
 * double cost is the cost of the Product Piece
 * double manufactureTime is the manufactureTime of the Product Piece
 */
public class Piece extends Product {
	double cost, manufactureTime;	
	
	/**
	 * Simple constructor that sets all the variables in this instance, but also sets description, to be set by the super class.
	 * @param description the name of the product to identify uniquely what it is
	 * @param cst the cost to be set
	 * @param mTime the manufactureTime to be set
	 */
	public Piece(String description, double cst, double mTime) {
		super(description);
		cost = cst;
		manufactureTime = mTime;
	}
	
	/**
	 * Since it's only one Piece, this method only sets the indent of this piece.
	 * @param indent the indent to be set
	 * @param list a list to read from
	 */
	public void addAllParts(int indent, List<Product> list) {
		setIndent(indent);
	}
	
	/**
	 * Simple getter to return the variable cost in this instance.
	 * @return the cost in this instance
	 */
	public double getCost() {
		return cost;
	}
	
	/**
	 * Simple setter to set the variable cost in this instance.
	 * @param the cost to be set in this instance
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	/**
	 * Simple getter to return the variable manufactureTime in this instance.
	 * @return the manufactureTime in this instance
	 */
	public double getManufactureTime() {
		return manufactureTime;
	}

	/**
	 * Simple setter to set the variable manufactureTime in this instance.
	 * @return the manufactureTime to be set in this instance
	 */
	public void setManufactureTime(double manufactureTime) {
		this.manufactureTime = manufactureTime;
	}

	/**
	 * Calls the visit method from the Visitor object.
	 * @param v the object to call the visit method on
	 * The visit method does different (or no) things depending on what subtype of Product this is.
	 */
	@Override
	public void accept(Visitor v) {
		v.visit(this);	
	}
}
