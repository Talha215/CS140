package assignment06;

import java.util.ArrayList;

public class SOMAudit implements DegreeAudit {
	@Override
	public boolean hasWritingRequirement() {
		return true;
	}
	
	@Override
	public boolean writingSatisfied(ArrayList<CourseOffering> list) {
		return true;
	}
}
