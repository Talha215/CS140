package assignment07;

public class Sorter implements Visitor {

	@Override
	public void visit(Product p) {
		// Do Nothing		
	}

	@Override
	public void visit(Subassembly p) {
		p.sort();
	}

	@Override
	public void visit(Piece p) {
		// Do Nothing
	}

}
