package assignment07;

import java.util.ArrayList;
import java.util.List;

public class Subassembly extends Product {
	
	public Subassembly(String description) {
		super(description);
	}

	ArrayList<Product> parts = new ArrayList<Product>();

	public void addAllParts(int indent, List<Product> list) {
		setIndent(indent);
		
		for(Product p: parts) {
			list.add(p);
			p.addAllParts(1 + indent, list);
		}
	}
	
	@Override
	public double getCost() {
		double total = 0;
		
		for(Product p: parts) {
			total += p.getCost();
		}
		
		return total;
	}

	@Override
	public double getManufactureTime() {
		double highTime = 0;
		
		for(Product p: parts) {
			if(p.getManufactureTime() > highTime)
				highTime = p.getManufactureTime();
		}
		
		return highTime;
	}
	
	public void add(Product p) {
		parts.add(p);
	}
}
