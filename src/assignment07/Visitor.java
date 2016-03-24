package assignment07;

/**
 * Interface to tie together the type of Visitors together, for better organization.
 * @author Talha
 * Each method is used in a specific case. 
 * In our program, we only use the Piece version of this method to increase or decrease some of the variables in Piece.
 * In another implementation, anything could be changed through implementation of the visit method.
 */
public interface Visitor {
	/**
	 * To be implemented. A visitor can change any part of the Product given.
	 * @param p the Product that can be manipulated.
	 */
	public void visit(Product p);
	
	/**
	 * To be implemented. A visitor can change any part of the Subassembly given.
	 * @param p the Subassembly that can be manipulated.
	 */
	public void visit(Subassembly p);
	
	/**
	 * To be implemented. A visitor can change any part of the Piece given.
	 * @param p the Piece that can be manipulated.
	 */
	public void visit(Piece p);
}
