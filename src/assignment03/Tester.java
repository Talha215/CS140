package assignment03;

public class Tester 
{
	public static void main(String[] args)
	{
		Elevator elev = new Elevator(20, 7, 15);
		
		System.out.println("Expected Value: 7");
		System.out.println(elev.getFloorIndex("G"));
		
		System.out.println("Expected Value: 3");
		System.out.println(elev.getFloorIndex("B4"));
		
		System.out.println("Expected Value: 19");
		System.out.println(elev.getFloorIndex("13"));
		
		
		System.out.println("Expected Value: G");
		System.out.println(elev.getFloorName(7));
		
		System.out.println("Expected Value: B7");
		System.out.println(elev.getFloorName(0));
		
		System.out.println("Expected Value: 4");
		System.out.println(elev.getFloorName(11));		
	}
}
