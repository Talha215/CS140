package assignment07;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Test1 {
	Piece[] piece;
	Subassembly[] assembly;
	
	@Before
	public void setup() {
		piece = new Piece[]{new Piece("Piece 0", 1, 2), new Piece("Piece 1", 2, 3), 
				new Piece("Piece 2", 3, 4), new Piece("Piece 3", 4, 5), 
				new Piece("Piece 4", 5, 6), new Piece("Piece 5", 6, 7),
				new Piece("Piece 6", 7, 8), new Piece("Piece 7", 8, 9), 
				new Piece("Piece 8", 9, 10), new Piece("Piece 9", 10, 11), 
				new Piece("Piece 10", 11, 12)};
		
		assembly = new Subassembly[]{new Subassembly("Assembly 0"), new Subassembly("Assembly 1"), 
				new Subassembly("Assembly 2"), new Subassembly("Assembly 3"), new Subassembly("Assembly 4")};
		
		assembly[0].add(piece[0]);
		
		assembly[1].add(piece[1]);
		assembly[1].add(piece[2]);
		assembly[1].add(piece[3]);
		
		assembly[0].add(assembly[1]);
		
		assembly[3].add(piece[4]);
		assembly[3].add(piece[5]);
		assembly[3].add(piece[6]);
		
		assembly[4].add(piece[7]);
		assembly[4].add(piece[8]);
		assembly[4].add(piece[9]);
		
		assembly[2].add(assembly[3]);
		assembly[2].add(assembly[4]);
		assembly[2].add(piece[10]);
		
		assembly[0].add(assembly[2]);
	}
	
	@Test
	public void testGetCost() {
		assertEquals(1.0, piece[0].getCost(), 0.0);
		assertEquals(2.0, piece[1].getCost(), 0.0);
		assertEquals(3.0, piece[2].getCost(), 0.0);
		assertEquals(4.0, piece[3].getCost(), 0.0);
		assertEquals(5.0, piece[4].getCost(), 0.0);
		assertEquals(6.0, piece[5].getCost(), 0.0);
		assertEquals(7.0, piece[6].getCost(), 0.0);
		assertEquals(8.0, piece[7].getCost(), 0.0);
		assertEquals(9.0, piece[8].getCost(), 0.0);
		assertEquals(10.0, piece[9].getCost(), 0.0);
		assertEquals(11.0, piece[10].getCost(), 0.0);
		
		assertEquals(66.0, assembly[0].getCost(), 0.0);
		assertEquals(9.0, assembly[1].getCost(), 0.0);
		assertEquals(56.0, assembly[2].getCost(), 0.0);
		assertEquals(18.0, assembly[3].getCost(), 0.0);
		assertEquals(27.0, assembly[4].getCost(), 0.0);	
	}
	
	@Test
	public void testGetManufactureTime() {
		assertEquals(2.0, piece[0].getManufactureTime(), 0.0);
		assertEquals(3.0, piece[1].getManufactureTime(), 0.0);
		assertEquals(4.0, piece[2].getManufactureTime(), 0.0);
		assertEquals(5.0, piece[3].getManufactureTime(), 0.0);
		assertEquals(6.0, piece[4].getManufactureTime(), 0.0);
		assertEquals(7.0, piece[5].getManufactureTime(), 0.0);
		assertEquals(8.0, piece[6].getManufactureTime(), 0.0);
		assertEquals(9.0, piece[7].getManufactureTime(), 0.0);
		assertEquals(10.0, piece[8].getManufactureTime(), 0.0);
		assertEquals(11.0, piece[9].getManufactureTime(), 0.0);
		assertEquals(12.0, piece[10].getManufactureTime(), 0.0);
		
		assertEquals(12.0, assembly[0].getManufactureTime(), 0.0);
		assertEquals(5.0, assembly[1].getManufactureTime(), 0.0);
		assertEquals(12.0, assembly[2].getManufactureTime(), 0.0);
		assertEquals(8.0, assembly[3].getManufactureTime(), 0.0);
		assertEquals(11.0, assembly[4].getManufactureTime(), 0.0);
	}
	
	@Test
	public void printTest() {
		for(Product p : assembly[0]) System.out.println(p.toString() + ": Cost = " + p.getCost()
				+ ", Manufacture time = " + p.getManufactureTime());
		testCostIncreaseVisitor();
		testMaunfactureTimeIncreaseVisitor();
	}
	
	//@Test being called by print so it runs in the correct order
	public void testCostIncreaseVisitor() {
		Visitor v = new CostIncreaseVisitor(50);
		for(Product p : assembly[0]) p.accept(v);
		System.out.println("\nIncreasing cost by 50%\n");
		for(Product p: assembly[0]) System.out.println(p.toString() + ": Cost = " + p.getCost()
		+ ", Manufacture time = " + p.getManufactureTime());
	}
	
	//@Test being called by print so it runs in the correct order
	public void testMaunfactureTimeIncreaseVisitor() {
		Visitor v = new ManufactureTimeIncreaseVisitor(-25);
		for(Product p : assembly[0]) p.accept(v);
		System.out.println("\nDecreasing manufactureTime by 25%\n");
		for(Product p: assembly[0]) System.out.println(p.toString() + ": Cost = " + p.getCost()
				+ ", Manufacture time = " + p.getManufactureTime());
	}
}
