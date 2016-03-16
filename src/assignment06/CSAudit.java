package assignment06;

import java.util.ArrayList;

public class CSAudit implements DegreeAudit {
	@Override
	public boolean hasWritingRequirement() {
		return true;
	}

	@Override
	public boolean writingSatisfied(ArrayList<CourseOffering> list) {
		int cjCounter = 0;
		boolean cs = false;
		for(CourseOffering c: list) { 
			if(c.getName().equals("CS301"))
				cs = true;
			for(String s: c.getAnnotations())
				if(s.equals("C") || s.equals("J"))
					cjCounter++;
		}

		return cjCounter > 1 && cs;
	}
}
