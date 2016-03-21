package assignment07;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Test1 {
	Piece[] piece;
	Subassembly[] assembly;
	
	@Before
	public void setup() {
		piece = new Piece[]{new Piece("test", 1, 2), new Piece("test", 2, 3), new Piece("test", 3, 4), new Piece("test", 4, 5), 
				new Piece("test", 5, 6), new Piece("test", 6, 7),
				new Piece("test", 7, 8), new Piece("test", 8, 9), 
				new Piece("test", 9, 10), new Piece("test", 10, 11), 
				new Piece("test", 11, 12)};
		
		assembly = new Subassembly[5];
		
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
		for(Product p : assembly[0]) System.out.println(p);
	}
	
	@Test
	public void testGetManufacturingTime() {
		assertTrue(true);
	}
}
