package assignment04;

import java.io.*;
import java.util.*;

public class ShuffleTest 
{
	public static void main(String[] args)
	{
		try (Scanner kbd = new Scanner(System.in); 
				PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", true)))) {
				int count = 15;
				System.out.println("How many elements should the test have? (default is 15)");
				String str = kbd.nextLine();
				Scanner scan = new Scanner(str);
				if(scan.hasNextInt()) {
					count = scan.nextInt();
				} 
				scan.close();
				output.println("Number of elements = " + count);
				
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(int i = 0; i < count; i++)
						list.add(i);
				
				//int[][] counters = new int[][];
				for(int i = 0; i < 100; i++)
				{
					Collections.shuffle(list);
					for(int j = 0; j < 100; j++)
					{
						
					}
					System.out.println(list);
				}
				
				
				
				/*double mean = ...
				System.out.println(mean);
				output.println("Mean = " + mean);
				double sDev = 0.0;
				...
				System.out.println(sDev);
				output.println("Standard Deviation = " + sDev);*/			
			} catch (IOException e) {
				System.out.println("IO exception");
			}
	}
}
