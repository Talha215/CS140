package assignment06;

import java.util.ArrayList;

public class SOMAudit implements DegreeAudit {
	@Override
	public boolean hasWritingRequirement() {
		return true;
	}
	
	@Override
	public boolean writingSatisfied(ArrayList<CourseOffering> list) {
		int cjCounter = 0;
		for(CourseOffering c: list) 
			for(String s: c.getAnnotations())
				if(s.equals("C") || s.equals("J"))
					cjCounter++;

		return cjCounter > 1;
	}
}
