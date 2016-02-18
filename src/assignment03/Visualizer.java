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
		
		Line line3 = new Line("3", elev);
		line3.getLine().add(new Passenger("6", elev));
		line3.getLine().add(new Passenger("B5", elev));
		
		Line lineB2 = new Line("B2", elev);
		lineB2.getLine().add(new Passenger("7", elev));
		lineB2.getLine().add(new Passenger("B5", elev));
		
		Line lineB4 = new Line("B4", elev);
		lineB4.getLine().add(new Passenger("G", elev));
		lineB4.getLine().add(new Passenger("B1", elev));
		
		line.loadElevator();
		for(int i = 0; i < 35; i++) 
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
			Line l = e.getLines().get(i);
			
			String str;
			if(l == null)
				str = "";
			else
				str = l.getLine() + "";
			if(i == e.getCurrentFloor())
				System.out.println(e.getFloorName(i) + "\t\t" + e.getNumOccupants() + "\t\t" + str);
			else
				System.out.println(e.getFloorName(i) + "\t\t0" + "\t\t" + str);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	}
}
