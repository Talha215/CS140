package assignment07;

public class ManufactureTimeIncreaseVisitor implements Visitor {
	private double increase;
	
	public ManufactureTimeIncreaseVisitor(double increase) {
		this.increase = increase;
	}
	
	@Override
	public void visit(Product p) {
		// Do Nothing
		
	}

	@Override
	public void visit(Subassembly p) {
		// Do Nothing
		
	}

	@Override
	public void visit(Piece p) {
		p.setManufactureTime(p.getManufactureTime() * (1 + increase/100));
	}

}
