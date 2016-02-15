package assignment03;

public class Passenger 
{
	private String destinationFloor; 
	private int id; 
	private static int nextId = 0;
	
	public Passenger(String destFl, Elevator elev)
	{
		if(destFl == null) 
		{
			throw new IllegalArgumentException("Cannot give null arguments");
		}
		
		int dest = elev.getFloorIndex(destFl);
		
		if(dest < 0)
			dest = 0;
		else if(dest >= elev.getNumFloors())
			dest = elev.getNumFloors() - 1;
		
		destinationFloor = elev.getFloorName(dest);
		id = ++nextId;
	}
	
	public String getDestinationFloor() { return destinationFloor; }
	public int getID() { return id; }
	public String toString() { return "" + id; }
}
