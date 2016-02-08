package assignment02;

public class Tester 
{
	@SuppressWarnings("null")
	public static void main(String[] args)
	{
		//countNulls test
		System.out.println("countNulls test");
		System.out.println("Expected value 0");
		System.out.println(Utilities02.countNulls(null));
		Object[] testObj = {}; 
		System.out.println("Expected value 0");
		System.out.println(Utilities02.countNulls(testObj));
		testObj = new String[]{"asdf", null, "scvbb", null, "garwe"};
		System.out.println("Expected value 2");
		System.out.println(Utilities02.countNulls(testObj));
		
		//countSpaces test
		System.out.println("\n\ncountSpaces test");
		String testStr;
		testStr = null;
		System.out.println("Expected value -1");
		System.out.println(Utilities02.countSpaces(testStr));
		testStr = "";
		System.out.println("Expected value 0");
		System.out.println(Utilities02.countSpaces(testStr));
		testStr = "ThisStringHasNoSpaces";
		System.out.println("Expected value 0");
		System.out.println(Utilities02.countSpaces(testStr));
		testStr = "This  String   has many     spaces";
		System.out.println("Expected value 11");
		System.out.println(Utilities02.countSpaces(testStr));
		
		//first test
		System.out.println("\n\nfirst test");
		testStr = null;
		System.out.println("Expected value null");
		System.out.println(Utilities02.first(testStr));
		testStr = "";
		System.out.println("Expected value \"\"");
		System.out.println(Utilities02.first(testStr));
		testStr = "    ";
		System.out.println("Expected value \"\"");
		System.out.println(Utilities02.first(testStr));
		testStr = "  word    ";
		System.out.println("Expected value \"word\"");
		System.out.println(Utilities02.first(testStr));
		testStr = "word";
		System.out.println("Expected value \"word\"");
		System.out.println(Utilities02.first(testStr));
		testStr = "    This is my sentence    ";
		System.out.println("Expected value \"This\"");
		System.out.println(Utilities02.first(testStr));
		testStr = "This is my sentence";
		System.out.println("Expected value \"This\"");
		System.out.println(Utilities02.first(testStr));
		
		//rest test
		System.out.println("\n\nrest test");
		testStr = null;
		System.out.println("Expected value null");
		System.out.println(Utilities02.rest(testStr));
		testStr = "";
		System.out.println("Expected value \"\"");
		System.out.println(Utilities02.rest(testStr));
		testStr = "    ";
		System.out.println("Expected value \"\"");
		System.out.println(Utilities02.rest(testStr));
		testStr = "  word    ";
		System.out.println("Expected value \"\"");
		System.out.println(Utilities02.rest(testStr));
		testStr = "word";
		System.out.println("Expected value \"\"");
		System.out.println(Utilities02.rest(testStr));
		testStr = "    This is my sentence    ";
		System.out.println("Expected value \"is my sentence\"");
		System.out.println(Utilities02.rest(testStr));
		testStr = "This is my sentence";
		System.out.println("Expected value \"is my sentence\"");
		System.out.println(Utilities02.rest(testStr));
		
		//withoutExtraSpaces test
		System.out.println("\n\nwithoutExtraSpaces test");
		testStr = "word";
		System.out.println("Expected value \"word\""); //testing first withouExtraSpaces
		System.out.println(Utilities02.first(Utilities02.withoutExtraSpaces(testStr)));
		testStr = "  word    ";
		System.out.println("Expected value \"word\"");
		System.out.println(Utilities02.first(Utilities02.withoutExtraSpaces(testStr)));
		testStr = "    This    is   my        sentence    ";
		System.out.println("Expected value \"is my sentence\""); //testing rest withoutExtraSpaces
		System.out.println(Utilities02.rest(Utilities02.withoutExtraSpaces(testStr)));
		testStr = "This is my  sentence";
		System.out.println("Expected value \"is my sentence\"");
		System.out.println(Utilities02.rest(Utilities02.withoutExtraSpaces(testStr)));
		
		//splitOnSpaces test
		System.out.println("\n\nsplitOnSpaces test");
		testStr = null;
		System.out.println("Expected value null");
		System.out.println(Utilities02.splitOnSpaces(testStr));
		testStr = "";
		System.out.println("Expected value ||");
		String[] testArr = Utilities02.splitOnSpaces(testStr);
		System.out.print("|");
		for(String s: testArr)
			System.out.print(s + "|");
		System.out.println();
		testStr = "This is a String with many words";
		System.out.println("Expected value |This|is|a|String|with|many|words|");
		testArr = Utilities02.splitOnSpaces(testStr);
		System.out.print("|");
		for(String s: testArr)
			System.out.print(s + "|");
		
		//splitOnSpaces1 test
		System.out.println("\n\nsplitOnSpaces1 test");
		testStr = null;
		System.out.println("Expected value null");
		System.out.println(Utilities02.splitOnSpaces1(testStr));
		testStr = "";
		System.out.println("Expected value |");
		testArr = Utilities02.splitOnSpaces1(testStr);
		System.out.print("|");
		for(String s: testArr)
			System.out.print(s + "|");
		System.out.println();
		testStr = "This is a String with many words";
		System.out.println("Expected value |This|is|a|String|with|many|words|");
		testArr = Utilities02.splitOnSpaces1(testStr);
		System.out.print("|");
		for(String s: testArr)
			System.out.print(s + "|");
		
		//strLengths test
		System.out.println("\n\nstrLengths test");
		testStr = null;
		System.out.println("Expected value null");
		System.out.println(Utilities02.strLengths(testStr));
		testStr = "";
		System.out.println("Expected value |0|");
		int[] testArrInt = Utilities02.strLengths(testStr);
		System.out.print("|");
		for(int i: testArrInt)
			System.out.print(i + "|");
		System.out.println();
		testStr = "This is a String with many words";
		System.out.println("Expected value |4|2|1|6|4|4|5|");
		testArrInt = Utilities02.strLengths(testStr);
		System.out.print("|");
		for(int i: testArrInt)
			System.out.print(i + "|");
		System.out.println();
		
		
		//InstanceMethodVersion tests
		InstanceMethodVersion test1 = null;
		InstanceMethodVersion test2 = new InstanceMethodVersion("");
		InstanceMethodVersion test3 = new InstanceMethodVersion("word");
		InstanceMethodVersion test4 = new InstanceMethodVersion("  word   ");
		InstanceMethodVersion test5 = new InstanceMethodVersion("     ");
		InstanceMethodVersion test6 = new InstanceMethodVersion("    This is my sentence    ");
		InstanceMethodVersion test7 = new InstanceMethodVersion("This is my sentence");
		InstanceMethodVersion test8 = new InstanceMethodVersion("    This    is   my        sentence    ");
		
		//InstanceMethodVersion countSpaces test
		System.out.println("\n\ncountSpaces test");
		System.out.println("Expected value -1");
		System.out.println(test1.countSpaces());
		System.out.println("Expected value 0");
		System.out.println(test2.countSpaces());
		System.out.println("Expected value 0");
		System.out.println(test3.countSpaces());
		System.out.println("Expected value 5");
		System.out.println(test4.countSpaces());
		
		//InstanceMethodVersion first test
		System.out.println("\n\nfirst test");
		System.out.println("Expected value null");
		System.out.println(test1.first());
		System.out.println("Expected value \"\"");
		System.out.println(test2.first());
		System.out.println("Expected value \"\"");
		System.out.println(test5.first());
		System.out.println("Expected value \"word\"");
		System.out.println(test4.first());
		System.out.println("Expected value \"word\"");
		System.out.println(test3.first());
		System.out.println("Expected value \"This\"");
		System.out.println(test6.first());
		System.out.println("Expected value \"This\"");
		System.out.println(test7.first());
		
	}
}
