package assignment07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Product implements Iterable<Product>, Comparable<Product> {
	private String description;
	private int indent;
	
	public Product(String description) {
		this.description = description;
	}
	
	public Iterator<Product> iterator() {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(this);
		addAllParts(0, list);
		return list.iterator();
	}
	
	public abstract double getCost();
	
	public abstract double getManufactureTime();
	
	protected abstract void addAllParts(int indent, List<Product> list);
	
	public void setCost(double cost) {
		throw new UnsupportedOperationException("Method setCost cannot be "
				+ "called on this object");
	}
	
	public void setManufactureTime(double manufactureTime) {
		throw new UnsupportedOperationException("Method setManufactureTime cannot be "
				+ "called on this object");
	}

	public int getIndent() {
		return indent;
	}

	public void setIndent(int indent) {
		this.indent = indent;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < indent; i++)
			sb.append("--");
		sb.append(description);
		
		return sb.toString();
	}
	
	abstract void accept(Visitor v);
	
	abstract int compareTo(Product other);
}
