package assignment07;

public class CostIncreaseVisitor implements Visitor {
	private double increase;
	
	public CostIncreaseVisitor(double increase) {
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
		p.setCost(p.getCost() * (1 + increase/100));
	}

}
