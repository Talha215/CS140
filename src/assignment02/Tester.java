package assignment02;

import java.util.Arrays;

public class Tester 
{
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
		System.out.println("Expected value []");
		System.out.println(Arrays.toString(Utilities02.splitOnSpaces(testStr)));
		testStr = "This is a String with many words";
		System.out.println("Expected value [This, is, a, String, with, many, words]");
		System.out.println(Arrays.toString(Utilities02.splitOnSpaces(testStr)));
	
		//splitOnSpaces1 test
		System.out.println("\n\nsplitOnSpaces1 test");
		testStr = null;
		System.out.println("Expected value null");
		System.out.println(Utilities02.splitOnSpaces1(testStr));
		testStr = "";
		System.out.println("Expected value []");
		System.out.println(Arrays.toString(Utilities02.splitOnSpaces1(testStr)));
		testStr = "This is a String with many words";
		System.out.println("Expected value [This, is, a, String, with, many, words]");
		System.out.println(Arrays.toString(Utilities02.splitOnSpaces1(testStr)));
		
		//strLengths test
		System.out.println("\n\nstrLengths test");
		testStr = null;
		System.out.println("Expected value null");
		System.out.println(Utilities02.strLengths(testStr));
		testStr = "";
		System.out.println("Expected value [0]");
		System.out.println(Arrays.toString(Utilities02.strLengths(testStr)));
		testStr = "This is a String with many words";
		System.out.println("Expected value [4, 2, 1, 6, 4, 4, 5]");
		System.out.println(Arrays.toString(Utilities02.strLengths(testStr)));
				
		//InstanceMethodVersion tests
		InstanceMethodVersion test1 = new InstanceMethodVersion(null);
		InstanceMethodVersion test2 = new InstanceMethodVersion("");
		InstanceMethodVersion test3 = new InstanceMethodVersion("word");
		InstanceMethodVersion test4 = new InstanceMethodVersion("  word   ");
		InstanceMethodVersion test5 = new InstanceMethodVersion("     ");
		InstanceMethodVersion test6 = new InstanceMethodVersion("    This   is my sentence    ");
		InstanceMethodVersion test7 = new InstanceMethodVersion("This is my   sentence");
		InstanceMethodVersion test8 = new InstanceMethodVersion("This is a sentence with many words");
		
		//InstanceMethodVersion countSpaces test
		System.out.println("\n\nInstanceMethodVersion countSpaces test");
		System.out.println("Expected value -1");
		System.out.println(test1.countSpaces());
		System.out.println("Expected value 0");
		System.out.println(test2.countSpaces());
		System.out.println("Expected value 0");
		System.out.println(test3.countSpaces());
		System.out.println("Expected value 5");
		System.out.println(test4.countSpaces());
		
		//InstanceMethodVersion first test
		System.out.println("\n\nInstanceMethodVersion first test");
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
		
		//InstanceMethodVersion rest test
		System.out.println("\n\nInstanceMethodVersion rest test");
		System.out.println("Expected value null");
		System.out.println(test1.rest());
		System.out.println("Expected value \"\"");
		System.out.println(test2.rest());
		System.out.println("Expected value \"\"");
		System.out.println(test5.rest());
		System.out.println("Expected value \"\"");
		System.out.println(test4.rest());
		System.out.println("Expected value \"\"");
		System.out.println(test3.rest());
		System.out.println("Expected value \"is my sentence\"");
		System.out.println(test6.rest());
		System.out.println("Expected value \"is my   sentence\"");
		System.out.println(test7.rest());		
		
		//InstanceMethodVersion withoutExtraSpaces test
		System.out.println("\n\nInstanceMethodVersion withoutExtraSpaces test");
		System.out.println("Expected value \"word\""); //testing first withouExtraSpaces
		System.out.println(new InstanceMethodVersion(test3.withoutExtraSpaces()).first());
		System.out.println("Expected value \"word\"");
		System.out.println(new InstanceMethodVersion(test4.withoutExtraSpaces()).first());
		System.out.println("Expected value \"is my sentence\""); //testing rest withoutExtraSpaces
		System.out.println(new InstanceMethodVersion(test6.withoutExtraSpaces()).rest());
		System.out.println("Expected value \"is my sentence\"");		
		System.out.println(new InstanceMethodVersion(test7.withoutExtraSpaces()).rest());		
		test3 = new InstanceMethodVersion("word");
		test4 = new InstanceMethodVersion("  word   ");
		test6 = new InstanceMethodVersion("    This   is my sentence    ");
		test7 = new InstanceMethodVersion("This is my   sentence");
		
		//InstanceMethodVersion splitOnSpaces test
		System.out.println("\n\nInstanceMethodVersion splitOnSpaces test");
		System.out.println("Expected value null");
		System.out.println(test1.splitOnSpaces());
		System.out.println("Expected value []");
		System.out.println(Arrays.toString(test2.splitOnSpaces()));
		System.out.println("Expected value [This, is, a, sentence, with, many, words]");
		System.out.println(Arrays.toString(test8.splitOnSpaces()));
		test1 = new InstanceMethodVersion(null);
		test2 = new InstanceMethodVersion("");		
		test8 = new InstanceMethodVersion("This is a sentence with many words");
		
		//InstanceMethodVersion splitOnSpaces1 test
		System.out.println("\n\nInstanceMethodVersion splitOnSpaces1 test");
		System.out.println("Expected value null");
		System.out.println(test1.splitOnSpaces1());
		System.out.println("Expected value []");
		System.out.println(Arrays.toString(test2.splitOnSpaces1()));
		System.out.println("Expected value [This, is, a, sentence, with, many, words]");
		System.out.println(Arrays.toString(test8.splitOnSpaces1()));
		test1 = new InstanceMethodVersion(null);
		test2 = new InstanceMethodVersion("");		
		test8 = new InstanceMethodVersion("This is a sentence with many words");
		
		//InstanceMethodVersion strLengths test
		System.out.println("\n\nInstanceMethodVersion strLengths test");
		System.out.println("Expected value null");
		System.out.println(test1.strLengths());
		System.out.println("Expected value [0]");
		System.out.println(Arrays.toString(test2.strLengths()));
		System.out.println("Expected value [4, 2, 1, 8, 4, 4, 5]");
		System.out.println(Arrays.toString(test8.strLengths()));
	}
}
