package assignment04;

import java.util.ArrayList;
import java.util.Arrays;

public class TownListTester 
{
	public static void main(String[] args)
	{
		TownList list = new TownList();
		
		//testing add(Town e)
		Town testAdd = new Town("Christchurch", "New Zealand", 
				Meridional.SOUTH, Zonal.EAST, 43, 31, 48, 172, 37, 13);
		System.out.println("True? " + list.add(testAdd));
		System.out.println("False? " + list.add(testAdd));
		System.out.println("False? " + list.add(testAdd));
		try
		{
			System.out.println("False? " + list.add(null));
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		
		
		
		//testing add(int index, Town element)
		System.out.println(list);
		list.add(2, testAdd);
		System.out.println(list);
		list.add(0, new Town("Karachi", "Pakistan", 
				Meridional.NORTH, Zonal.EAST, 24, 51, 36, 67, 0, 36));
		System.out.println(list);
		try
		{
			list.add(3, null);
			System.out.println(list);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		//testing addAll(Collection<? extends Town> c)
		ArrayList<Town> newList = new ArrayList<Town>(Arrays.asList(testAdd, null, new Town("Shanghai", "China", 
				Meridional.NORTH, Zonal.EAST, 31, 12, 0, 121, 30, 0),
				new Town("Williamsport, PA", "USA", 
						Meridional.NORTH, Zonal.WEST, 41, 14, 40, 77, 1, 30),
				new Town("Beijing", "China", 
						Meridional.NORTH, Zonal.EAST, 39, 55, 0, 116, 23, 0)));
		try
		{
			System.out.println("True? " + list.addAll(newList));
			System.out.println("False? " + list.addAll(newList));
			System.out.println(list);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		//testing addAll(int index, Collection<? extends Town> c)
		ArrayList<Town> newerList = new ArrayList<Town>(Arrays.asList(
				new Town("San Francisco", "USA", 
						Meridional.NORTH, Zonal.EAST, 37, 47, 0, 122, 20, 0),
				testAdd, null,
				new Town("Seattle", "USA", 
						Meridional.NORTH, Zonal.EAST, 47, 37, 0, 122, 20, 0),
				new Town("Lagos", "Nigeria", 
						Meridional.NORTH, Zonal.EAST, 6, 27, 18, 3, 23, 3)));
		try
		{
			System.out.println("True? " + list.addAll(2, newerList));
			System.out.println("False? " + list.addAll(2, newerList));
			System.out.println("False? " + list.addAll(6, newerList));
			System.out.println(list);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
	}
}
