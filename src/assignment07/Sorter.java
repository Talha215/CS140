package assignment07;

/**
 * This type of Visitor only applies to Subassembly.
 * It sorts the ArrayList in Subassembly when a Visitor calls the visit method with a Subassembly.
 * @author Talha
 */
public class Sorter implements Visitor {

	/**
	 * This method does nothing because you cannot use this type of class on this type of Object.
	 * @param p Since this is a Product, this class doesn't apply. Therefore nothing happens.
	 */
	@Override
	public void visit(Product p) {
		// Do Nothing		
	}

	/**
	 * This method sorts the ArrayList in Subassembly p using the sort method we created earlier in Subassembly.
	 * @param p Since this is a Subassembly, visit can apply. p is used to find the ArrayList that needs to be sorted.
	 */
	@Override
	public void visit(Subassembly p) {
		p.sort();
	}

	/**
	 * This method does nothing because you cannot use this type of class on this type of Object.
	 * @param p Since this is a Piece, this class doesn't apply. Therefore nothing happens.
	 */
	@Override
	public void visit(Piece p) {
		// Do Nothing
	}

}
