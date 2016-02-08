package assignment01;

public class Class 
{
	private String name, number;
	private int numCredits, crn;
	private double qualPoints;
	
	public static final Class DUMMY_CLASS = new Class("Dummy", "000", 0, 0);

	public Class(String aName, String aNumber, int aNumCredits, int aCrn)
	{
		name = aName;
		number = aNumber;
		numCredits = aNumCredits;
		crn = aCrn;
	}
	
	public String getName() 		{return name;}
	public String getNumber() 		{return number;}
	public int getNumCredits() 		{return numCredits;}
	public int getCrn() 			{return crn;}
	public double getQualPoints() 	{return qualPoints;}
	
	public void setQualPoints(double qualPoints) {this.qualPoints = qualPoints;}
	
	
}
