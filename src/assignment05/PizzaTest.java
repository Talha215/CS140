package assignment05;

import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaTest {

	@Test
	public void test1() {
		Pizza order = new MediumCheesePizza();
		order = new Mushroom(order);
		order = new Pepperoni(order);
		order = new Sausage(order);
		order = new ExtraCheese(order);
		assertEquals(11.5, order.getCost(), 1E-6);
	}
	
	@Test
	public void test2() {
		Pizza order = new SmallCheesePizza();
		order = new Mushroom(order);
		order = new Pepperoni(order);
		order = new Sausage(order);
		order = new ExtraCheese(order);
		assertEquals(9.5, order.getCost(), 1E-6);
	}
}
