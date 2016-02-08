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
		self = this.self;
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
	
	public Class getClass1() {return class1;}
	public Class getClass2() {return class2;}
	public Class getClass3() {return class3;}
	public Class getClass4() {return class4;}
	
	public void setClass1(Class class1) {class1 = this.class1;}
	public void setClass2(Class class1) {class2 = this.class2;}
	public void setClass3(Class class1) {class3 = this.class3;}
	public void setClass4(Class class1) {class4 = this.class4;}
}
