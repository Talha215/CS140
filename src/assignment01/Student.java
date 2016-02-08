package assignment01;
//self of type Person and four Class fields class1, class2, class3, class4, all initialized to equal Class.DUMMY_CLASS.
public class Student 
{
	private Person self;
	private Class class1 = Class.DUMMY_CLASS;
	private Class class2 = Class.DUMMY_CLASS;
	private Class class3 = Class.DUMMY_CLASS;
	private Class class4 = Class.DUMMY_CLASS;
	
	public Student(Person self)
	{
		this.self = self;
	}
	
	public void setQualPoints1(double qPoints) 
	{
	    class1.setQualPoints(qPoints);
	}
	
	public void setQualPoints2(double qPoints) 
	{
	    class2.setQualPoints(qPoints);
	}
	
	public void setQualPoints3(double qPoints) 
	{
	    class3.setQualPoints(qPoints);
	}
	
	public void setQualPoints4(double qPoints) 
	{
	    class4.setQualPoints(qPoints);
	}
	
	public String getName()
	{
		return self.getFirstName() + " " + self.getMiddleInitial() + ". " + self.getLastName();
	}
	
	public double computeSemesterGPA()
	{
		double gpa = 0.0;
		double totalPoints = class1.getQualPoints() + class2.getQualPoints() + class3.getQualPoints() + class4.getQualPoints();
		int totalCredits = class1.getNumCredits() + class2.getNumCredits() + class3.getNumCredits() + class4.getNumCredits();
		
		if(totalCredits > 0)
			gpa = totalPoints / totalCredits;
		
		return gpa;
	}
	
	public Class getClass1() {return class1;}
	public Class getClass2() {return class2;}
	public Class getClass3() {return class3;}
	public Class getClass4() {return class4;}
	
	public void setClass1(Class class1) {this.class1 = class1;}
	public void setClass2(Class class2) {this.class2 = class2;}
	public void setClass3(Class class3) {this.class3 = class3;}
	public void setClass4(Class class4) {this.class4 = class4;}
}
