package assignment06;

import java.util.ArrayList;

public class HarpurAudit implements DegreeAudit {
	@Override
	public boolean hasWritingRequirement() {
		return true;
	}
	
	@Override
	public boolean writingSatisfied(ArrayList<CourseOffering> list) {
		return true;
	}
}
