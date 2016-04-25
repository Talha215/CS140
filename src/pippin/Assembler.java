package pippin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Assembler {
	public static Set<String> noArgument = new TreeSet<String>();   
	static {
		noArgument.add("HALT");
		noArgument.add("NOP");
		noArgument.add("NOT");
	}
	
	/**
	 * Method to assemble a file to its executable representation. 
	 * If the input has errors one of the errors will be reported 
	 * the StringBulder. The error may not be the first error in 
	 * the code and will depend on the order in which instructions 
	 * are checked. The line number of the error that is reported 
	 * is returned as the value of the method. 
	 * A return value of 0 indicates that the code had no errors 
	 * and an output file was produced and saved. If the input or 
	 * output cannot be opened, the return value is -1.
	 * The unchecked exception IllegalArgumentException is thrown 
	 * if the error parameter is null, since it would not be 
	 * possible to provide error information about the source code.
	 * @param input the source assembly language file
	 * @param output the executable version of the program if 
	 * the source program is correctly formatted
	 * @param error the StringBuilder to store the description 
	 * of the error that is reported. It will be empty (length 
	 * zero) if no error is found.
	 * @return 0 if the source code is correct and the executable 
	 * is saved, -1 if the input or output files cannot be opened, 
	 * otherwise the line number of the reported error.
	 */
	public static int assemble(File input, File output, StringBuilder error) {
		try (Scanner inp = new Scanner(input)) {
//			...
//			...
//			at the end of the try block put:
			} catch (FileNotFoundException e) {
				error.append("Unable to open the assembled file");
				return -1;
			}
		return 0;
	}
	
	public static void main(String[] args) {
		StringBuilder error = new StringBuilder();
		System.out.println("Enter the name of the file without extension: ");
		try (Scanner keyboard = new Scanner(System.in)) {
			String filename = keyboard.nextLine();
			int i = assemble(new File(filename + ".pasm"), 
					new File(filename + ".pexe"), error);
			System.out.println(i + " " + error);
		}
	}
}
