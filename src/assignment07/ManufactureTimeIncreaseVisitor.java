package assignment07;

/**
 * This class is a type of Visitor
 * It specializes in increasing the manufactureTime variable by a percentage of increase.
 * @author Talha
 * double increase is the amount to increase by.
 */
public class ManufactureTimeIncreaseVisitor implements Visitor {
	private double increase;
	
	/**
	 * 1-argument constructor that sets the percentage of increase that will be influencing the manufacture time.
	 * @param increase the percentage to increase (if negative, to decrease)
	 */
	public ManufactureTimeIncreaseVisitor(double increase) {
		this.increase = increase;
	}
	
	/**
	 * Does nothing.
	 * Is here to specifically override visit to do nothing rather than something.
	 */
	@Override
	public void visit(Product p) {
		// Do Nothing
		
	}

	/**
	 * Does nothing.
	 * Is here to specifically override visit to do nothing rather than something.
	 */
	@Override
	public void visit(Subassembly p) {
		// Do Nothing
		
	}

	/**
	 * This method sets the manufactureTime of the Piece given by an increase or decrease depending on the double increase variable.
	 * @param p the Piece, the subtype of Product to increase / decrease the manufactureTime of.
	 */
	@Override
	public void visit(Piece p) {
		p.setManufactureTime(p.getManufactureTime() * (1 + increase/100));
	}

}
