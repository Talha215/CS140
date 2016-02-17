package assignment03;

import java.util.ArrayList;

public class Line 
{
	 private String floor; 
	 private ArrayList<Passenger> line = new ArrayList<Passenger>();
	 private Elevator elevator;
	 
	 public Line(String flr, Elevator elev)
	 {
		 floor = flr;
		 elevator = elev;
		 elev.addLine(flr, this);
	 }
	 
	 public void loadElevator()
	 {
		 Passenger[] temp = new Passenger[line.size()];
		 
		 for(int i = 0; i < temp.length; i++)
			 temp[i] = line.get(i);
		 int thisFloor = elevator.getFloorIndex(floor);
		 
		 if(elevator.getCurrentDir() == Direction.UP)
		 {
			 for(Passenger p: temp)
				 if(elevator.getFloorIndex(p.getDestinationFloor()) > thisFloor)
					 if(elevator.addOccupants(p))
						 line.remove(p);
		 }
		 else
		 {
			 for(Passenger p: temp)
				if(elevator.getFloorIndex(p.getDestinationFloor()) < thisFloor)
					if(elevator.addOccupants(p))
						line.remove(p);
		 }		 								 
	 }
	 
	 public ArrayList<Passenger> getLine() { return line; }
}
