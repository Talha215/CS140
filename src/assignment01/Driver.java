package assignment01;

public class Driver 
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Talha", 'A', "Qureshi");
		Person p2 = new Person("Albert", 'Z', "Einstein");
		Person p3 = new Person("Joe", '5', "Moron");
		
		Student s1 = new Student(p1);
		Student s2 = new Student(p2);
		Student s3 = new Student(p3);
		
		//s1 remains unchanged
		
		//s2
		Class physics = new Class("Physics", "PHY131", 4, 22598);
		Class math = new Class("Math", "MATH323", 4, 33333);
		Class art = new Class("Art", "ART422", 1, 12345);
		
		s2.setClass2(physics);
		s2.setClass3(math);
		s2.setClass4(art);
		
		s2.setQualPoints2(physics.getNumCredits() * 4); //got an A in physics
		s2.setQualPoints3(math.getNumCredits() * 3.3); //got a B+ in math
		s2.setQualPoints4(art.getNumCredits() * 2.3); //got a C+ in art
		
		//s3
		Class astphy = new Class("Astrophysics", "ASTR541", 8, 78999);
		Class writ = new Class("Writing", "WRIT111", 4, 12355);
		Class gym = new Class("Physical Education", "PE431", 2, 44323);
		Class cs140 = new Class("Programming with Objects", "CS140", 4, 10385);
		
		s3.setClass1(astphy);
		s3.setClass2(writ);
		s3.setClass3(gym);
		s3.setClass4(cs140);
		
		s3.setQualPoints1(astphy.getNumCredits() * 1); //got a D in astrophysics
		s3.setQualPoints2(writ.getNumCredits() * 4); //got an A in writing
		s3.setQualPoints3(gym.getNumCredits() * 4); //got an A in gym
		s3.setQualPoints4(cs140.getNumCredits() * 0); //got an F in cs140
		
		//print GPA and expected GPA of each student
		System.out.printf("%s's GPA: %.3f\nExpected GPA: 0.000\n\n", s1.getName(), s1.computeSemesterGPA()); //(0cred) = 0 GPA
		System.out.printf("%s's GPA: %.3f\nExpected GPA: 3.500\n\n", s2.getName(), s2.computeSemesterGPA()); //A (4cred), B+(4cred), C+(1cred) = 3.500 GPA
		System.out.printf("%s's GPA: %.3f\nExpected GPA: 1.778\n\n", s3.getName(), s3.computeSemesterGPA()); //D (8cred), A(4cred), A(2cred), F(4cred) = 1.778 GPA
		
	}
}
