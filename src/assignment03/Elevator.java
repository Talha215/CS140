package assignment03;

import java.util.ArrayList;

public class Elevator 
{
	private int currentFloor, groundFloor, capacity, numFloors;
	private ArrayList<Passenger> occupants = new ArrayList<Passenger>();
	private ArrayList<Line> lines = new ArrayList<Line>();
	private Direction currentDir = Direction.UP;
	
	public Elevator(int nf, int gf, int cap)
	{
		capacity = cap;
		numFloors = nf;
		groundFloor = gf;
		currentFloor = gf;
		
		for(int i = 0; i < numFloors; i++)
			lines.add(null);
	}
	
	public int getNumFloors() { return numFloors; }
	public int getCurrentFloor() { return currentFloor; }
	public Direction getCurrentDir() { return currentDir; }
	public ArrayList<Line> getLines() { return lines; }
	public int getNumOccupants() { return occupants.size(); }
	
	/**
	 * fix the way this works, k?
	 */
	public String getFloorName(int index)
	{
		if(index < 0 || index >= numFloors) 
		{
			throw new IllegalArgumentException("Illegal floor number");
		}
		
		if(index == groundFloor)
			return "G";
		else if(index == groundFloor + 1)
			return "2";
		else if(index == groundFloor + 2)
			return "3";
		else if(index == groundFloor + 3)
			return "4";
		else if(index == groundFloor + 4)
			return "5";
		else if(index == groundFloor + 5)
			return "6";
		else if(index == groundFloor + 6)
			return "7";
		else if(index == groundFloor + 7)
			return "8";
		else if(index == groundFloor + 8)
			return "9";
		else if(index == groundFloor + 9)
			return "10";
		else if(index == groundFloor - 1)
			return "B1";
		else if(index == groundFloor - 2)
			return "B2";
		else if(index == groundFloor - 3)
			return "B3";
		else if(index == groundFloor - 4)
			return "B4";
		else
			return "B5";
	}
	
	public int getFloorIndex(String floor)
	{
		if(floor.equals("G"))
			return groundFloor;
		
		if(floor.startsWith("B"))
			return Integer.parseInt(floor.substring(1)) - groundFloor;
		
		return groundFloor + Integer.parseInt(floor) - 1;		
			
	}
	
	public boolean addOccupants(Passenger p)
	{
		if(occupants.size() < capacity)
		{
			occupants.add(p);
			return true;
		}
		return false;
	}
	
	public void addLine(String flr, Line ln)
	{
		int floor = getFloorIndex(flr);
		lines.set(floor, ln);
	}
	
	public void move()
	{
		if(currentDir == Direction.UP && currentFloor < numFloors - 1)
			currentFloor++;
		else if(currentDir == Direction.UP && currentFloor == numFloors - 1)
		{
			currentDir = Direction.DOWN;
			currentFloor--;
		}
		else if(currentDir == Direction.DOWN && currentFloor > 0)
			currentFloor--;
		else if(currentDir == Direction.DOWN && currentFloor == 0)
		{
			currentDir = Direction.UP;
			currentFloor++;
		}
		
		Passenger[] temp = new Passenger[occupants.size()];
		
		for(Passenger p: temp)
			if(getFloorIndex(p.getDestinationFloor()) == currentFloor)
				occupants.remove(p);
		
		if(lines.get(currentFloor) != null)
			lines.get(currentFloor).loadElevator();
		
	}
	
}
