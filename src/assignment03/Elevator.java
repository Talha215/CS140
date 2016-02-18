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
	
	public String getFloorName(int index)
	{
		if(index < 0 || index >= numFloors) 
			throw new IllegalArgumentException("Illegal floor number");
		
		if(index == groundFloor)
			return "G";
		if(index < groundFloor)
			return "B" + (groundFloor - index);
		return (index - groundFloor + 1) + "";
	}
	
	/**
	 * This method will convert the STRING of the floor name to the correct index of that floor.
	 * EX: "B3" turns to 2 in a system that goes from "B5" as the bottom floor (index 0).
	 * @param <floor> This is the STRING of the floor name. User friendly nomenclature.
	 * @return Index of the floor requested. Works with indices. Not user friendly.
	 */
	public int getFloorIndex(String floor)
	{
		if(floor.equals("G"))
			return groundFloor;
		
		if(floor.startsWith("B"))
			return groundFloor - Integer.parseInt(floor.substring(1));
		
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
	
	/**
	 * This method moves the elevator UP or DOWN ONE FLOOR based on 
	 * the current direction of the elevator and the actual floor the elevator is on.
	 * The elevator "turns around" when it reaches the top of the building or the bottom.
	 * Once it moves to a new floor, the elevator lets off the people that need to leave on that floor
	 * and lets on anyone in the line on that floor that agrees with the direction the elevator is going.
	 */
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
		for(int i = 0; i < temp.length; i++)
			 temp[i] = occupants.get(i);
		
		for(Passenger p: temp)
			if(getFloorIndex(p.getDestinationFloor()) == currentFloor)
				occupants.remove(p);
		
		if(lines.get(currentFloor) != null)
			lines.get(currentFloor).loadElevator();
		
	}
	
}
