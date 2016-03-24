package assignment07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class is the framework for the assignment.
 * It is abstract, with a couple of abstract methods.
 * It implements Iterable and Comparable, which will be used by its subclasses to
 * define the hierarchy and compare objects.
 * 
 * @author Talha
 * 
 * String description : A string used as an identifier to objects
 * int indent : Used with print later on; also helps organize where it belongs in the hierarchy of objects
 */
public abstract class Product implements Iterable<Product>, Comparable<Product> {
	private String description;
	private int indent;
	
	/**
	 * This is a default 1-arg constructor. It sets the description field.
	 * @param description sets the private String description. It's basically the "name" of the Product
	 */
	public Product(String description) {
		this.description = description;
	}
	
	/**
	 * This iterator is necessary when traversing arrays of Products which contain more products in each element
	 * For our purposes, it is used in "Subassembly"
	 */
	public Iterator<Product> iterator() {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(this);
		addAllParts(0, list);
		return list.iterator();
	}
	
	/**
	 * This is abstract, so all subclasses must implement their own version.
	 * @return cost variable or some accumulation of cost. To be implemented in subclasses
	 */
	public abstract double getCost();
	
	/**
	 * This is abstract, so all subclasses must implement their own version.
	 * @return manufatcureTime variable or some accumulation of cost. To be implemented in subclasses
	 */
	public abstract double getManufactureTime();
	
	/**
	 * This is abstract, so all subclasses must implement their own version.
	 * This method adds all of the parts under your object with the correct indentation.
	 * @param indent the level of layers this object is in the hierarchy.
	 * @param list the list that involves all of the objects in the hierarchy.
	 */
	protected abstract void addAllParts(int indent, List<Product> list);
	
	/**
	 * Will set cost when a subclass has that variable.
	 * This class does not, therefore, it throws an exception.
	 * @param cost no use in this method, to be overriden.
	 */
	public void setCost(double cost) {
		throw new UnsupportedOperationException("Method setCost cannot be "
				+ "called on this object");
	}
	
	/**
	 * Will set manufatureTime when a subclass has that variable.
	 * This class does not, therefore, it throws an exception.
	 * @param manufactureTime no use in this method, to be overriden.
	 */
	public void setManufactureTime(double manufactureTime) {
		throw new UnsupportedOperationException("Method setManufactureTime cannot be "
				+ "called on this object");
	}

	/**
	 * Simple getter method for private indent variable.
	 * @return int indent variable
	 */
	public int getIndent() {
		return indent;
	}

	/**
	 * Simple setter method for private indent variable.
	 * @param indent the int to set the indent variable to in this instance
	 */
	public void setIndent(int indent) {
		this.indent = indent;
	}
	
	/**
	 * Method makes and returns a String that is digestible to the user or tester.
	 * Overrides the generic toString() method that returns an Object's reference.
	 * Adds "--" the number of times int indent is. This makes it easier to see the hierarchy of objects.
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < indent; i++)
			sb.append("--");
		sb.append(description);
		
		return sb.toString();
	}
	
	/**
	 * This is abstract, so all subclasses must implement their own version.
	 * @param v a Visitor object that is manipulated differently depending on which type of Product is being processed.
	 */
	abstract void accept(Visitor v);
	
	/**
	 * Depending on the hierarchy of this and other object subtypes, this compares the two objects and returns which object overrides the other.
	 * @param other the second item to compare this to.
	 * @return int either -1, 0, or 1 depending on what types of objects these Products are.
	 */
	public int compareTo(Product other) {
		if(this instanceof Piece && other instanceof Subassembly)
			return -1;
		if(this instanceof Subassembly && other instanceof Piece)
			return 1;
		return 0;
		
	}
}
