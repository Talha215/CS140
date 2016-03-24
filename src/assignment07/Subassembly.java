package assignment07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Subassembly is a special type of Product.
 * This version of Product is more like a collection of many products.
 * Uses an ArrayList to keep track of multiple Products in one instance of Subassembly.
 * @author Talha
 */
public class Subassembly extends Product {
	ArrayList<Product> parts = new ArrayList<Product>();
	
	/**
	 * Default 1-arg constructor that does nothing else but call the super constructor for Product.
	 * This super constructor sets a description for this instance of Subassembly.
	 */
	public Subassembly(String description) {
		super(description);
	}	

	/**
	 * Being implemented because of the abstract superclass's method. 
	 * This method first sets the indent for the first product in list, then adds that item to the ArrayList in this.
	 * Next, it is recursively called with an indent value of indent + 1. This makes it so the indent will be increased for the next Product.
	 * @param indent The indent that all of the Products in this list will be set to.
	 * @param list The list that contains all of the Products to be implemented in this instance of Subassembly.
	 */
	public void addAllParts(int indent, List<Product> list) {
		setIndent(indent);
		
		for(Product p: parts) {
			list.add(p);
			p.addAllParts(1 + indent, list);
		}
	}
	
	/**
	 * Since there is no single double cost in this class, we add up the getCost() from every Product in the ArrayList in this.
	 * @return the total of all the costs of each item in this ArrayList.
	 */
	@Override
	public double getCost() {
		double total = 0;
		
		for(Product p: parts) {
			total += p.getCost();
		}
		
		return total;
	}

	
	/**
	 * Since there is no single double manufactureTime in this class, we find the highest manufactureTime from every Product in the ArrayList in this.
	 * @return the highest manufactureTime in this ArrayList.
	 */
	@Override
	public double getManufactureTime() {
		double highTime = 0;
		
		for(Product p: parts) {
			if(p.getManufactureTime() > highTime)
				highTime = p.getManufactureTime();
		}
		
		return highTime;
	}
	
	/**
	 * Simple add method which adds a Product to this ArrayList.
	 * @param p the Product object to add to this ArrayList.
	 */
	public void add(Product p) {
		parts.add(p);
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

	/**
	 * Simple extension of the sort method in collections.
	 * This sorts the ArrayList parts in this instance of Subassembly according to Collections's sort method.
	 */
	public void sort() {
		Collections.sort(parts);
	}
}
