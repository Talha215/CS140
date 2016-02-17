package assignment03;

public class Visualizer 
{
	public static void main(String[] args)
	{
		Elevator elev = new Elevator(15, 5, 10);
		Line line = new Line("G", elev);
		
		for(int i = 0; i < 7; i++)
			line.getLine().add(new Passenger("7", elev));
		for(int i = 0; i < 3; i++)
			line.getLine().add(new Passenger("3", elev));
		for(int i = 0; i < 3; i++)
			line.getLine().add(new Passenger("B3", elev));
		
		line.loadElevator();
		showElev(elev);
		for(int i = 0; i < 30; i++) 
		{
			showElev(elev);
			elev.move();
		}
		showElev(elev);
	}
	
	public static void showElev(Elevator e) 
	{
		for(int i = e.getNumFloors() - 1; i >= 0; i--)
		{
			if(i == e.getCurrentFloor())
				System.out.println(e.getFloorName(i) + "\t\t" + e.getNumOccupants());
			else
				System.out.println(e.getFloorName(i) + "\t\t0");
		}
		System.out.println("+++++++++++++++++++++");
	}
}
