package assignment05;

public class Driver {
	public static void main(String[] args) {
		Pizza order = new MediumCheesePizza();
		System.out.println(order.getDescription() + " " + order.getCost());
		order = new Mushroom(order);
		System.out.println(order.getDescription() + " " + order.getCost());
		order = new Pepperoni(order);
		System.out.println(order.getDescription() + " " + order.getCost());
		order = new ExtraCheese(order);
		System.out.println(order.getDescription() + " " + order.getCost());
		order = new Sausage(order);
		System.out.println(order.getDescription() + " " + order.getCost());
	}
}
