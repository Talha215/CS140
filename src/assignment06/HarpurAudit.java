package assignment06;

import java.util.ArrayList;

public class HarpurAudit implements DegreeAudit {
	@Override
	public boolean hasWritingRequirement() {
		return true;
	}
	
	@Override
	public boolean writingSatisfied(ArrayList<CourseOffering> list) {
		int wCounter = 0, cjCounter = 0;
		for(CourseOffering c: list) 
			for(String s: c.getAnnotations())
				if(s.equals("W"))
					wCounter++;
				else if(s.equals("C") || s.equals("J"))
					cjCounter++;

		return (wCounter > 2 && cjCounter > 1) ||
			   (wCounter > 0 && cjCounter > 2) ||
			   (cjCounter > 3);
	}
}
