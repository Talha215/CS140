package assignment04;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.Arrays;

public class Geometry 
{
	public static void main(String[] args)
	{
		/**
		 * I had very little time to do this.
		 * There are obvious errors, and I know I didn't get most of it right.
		 * I budgeted my time incorrectly with a few other classes and had to prioritize.
		 * I'm probably capable of doing it, just needed more time.
		 * Maybe next time...
		 */
		
		
		ArrayList<Point2D.Double> list = new ArrayList<Point2D.Double>();
		double area = area(list);
	}
	
	public static void reduce(ArrayList<Point2D.Double> list) throws IllegalArgumentException
	{
		if(list == null || list.size() < 2)
			throw new IllegalArgumentException();
		
		double mostRight = 0;
		//int rightI = 0;
		double mostLeft = 0;
		//int leftI = 0;
		double mostUp = 0;
		//int upI = 0;
		double mostDown = 0;
		//int downI = 0;
		boolean flag = false;
		
		Point2D.Double[] arr = (Point2D.Double[])list.toArray();
				
		for(int i = 0; i < arr.length; i++)
		{
			arr = (Point2D.Double[])list.toArray();
			double x = arr[i].x;
			double y = arr[i].y;
			
			if(x > mostRight)
			{
				flag = true;
				//rightI = i;
				mostRight = x;
			}
			if(x < mostLeft)
			{
				flag = true;
				//leftI = i;
				mostLeft = x;
			}			
			if(y > mostUp)
			{
				flag = true;
				//upI = i;
				mostUp = y;
			}
			if(y < mostDown)
			{
				flag = true;
				//downI = i;
				mostDown = x;
			}
			
			if(!flag)
				list.remove(i);
			flag = false;
		}				
	}
	
	public static double area(ArrayList<Point2D.Double> list)
	{
		reduce(list);
		
		return (list.get(1).x - list.get(0).x)*(list.get(1).y - list.get(0).y);
	}
}
