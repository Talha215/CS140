package assignment01;
//two Strings lastName and firstName and a char called middleInitial
public class Person 
{
	private String lastName, firstName;
	private char middleInitial;
	
	public Person(String firstName, char middleInitial, String lastName)
	{
		firstName = this.firstName;
		middleInitial = this.middleInitial;
		lastName = this.lastName;
	}
	
	public String getFirstName() {return firstName;}
	public String getLastName()  {return lastName;}
	public char getMiddleInitial() {return middleInitial;}
}
