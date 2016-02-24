package assignment04;
import java.util.Collections;
public class MapTest {
	public static void main(String[] args) {
		TownList towns = new TownList();
		
		towns.add(new Town("Lima", "Peru", 
			Meridional.SOUTH, Zonal.WEST, 12, 2, 36, 77, 1, 30));
		towns.add(new Town("Williamsport, PA", "USA", 
			Meridional.NORTH, Zonal.WEST, 41, 14, 40, 77, 1, 30));
		towns.add(new Town("London", "UK", 
			Meridional.NORTH, Zonal.WEST, 51, 30, 26, 0, 7, 39));
		towns.add(new Town("Valencia", "Spain", 
			Meridional.NORTH, Zonal.WEST, 39, 28, 0, 0, 23, 0));
		towns.add(new Town("Mumbai", "India", 
			Meridional.NORTH, Zonal.EAST, 18, 58, 30, 72, 49, 33));
		towns.add(new Town("Beijing", "China", 
			Meridional.NORTH, Zonal.EAST, 39, 55, 0, 116, 23, 0));
		towns.add(new Town("Valencia", "Spain", 
			Meridional.NORTH, Zonal.WEST, 39, 28, 0, 0, 23, 0));
		towns.add(new Town("Christchurch", "New Zealand", 
			Meridional.SOUTH, Zonal.EAST, 43, 31, 48, 172, 37, 13));
		
		towns.add(new Town("Shanghai", "China", 
				Meridional.NORTH, Zonal.EAST, 31, 12, 0, 121, 30, 0));
		towns.add(new Town("Lagos", "Nigeria", 
				Meridional.NORTH, Zonal.EAST, 6, 27, 18, 3, 23, 3));
		towns.add(new Town("Delhi", "India", 
				Meridional.NORTH, Zonal.EAST, 28, 36, 36, 77, 13, 48));
		towns.add(new Town("Karachi", "Pakistan", 
				Meridional.NORTH, Zonal.EAST, 24, 51, 36, 67, 0, 36));
		towns.add(new Town("Tokyo", "Japan", 
				Meridional.NORTH, Zonal.EAST, 35, 51, 0, 139, 41, 0));
		towns.add(new Town("Guangzhou", "China", 
				Meridional.NORTH, Zonal.EAST, 23, 8, 0, 113, 16, 0));
		towns.add(new Town("Sao Paulo", "Brazil", 
				Meridional.SOUTH, Zonal.WEST, 23, 33, 0, 46, 38, 0));
		towns.add(new Town("Jakarta", "Indonesia", 
				Meridional.SOUTH, Zonal.EAST, 6, 12, 0, 106, 49, 0));
		towns.add(new Town("Seattle", "USA", 
				Meridional.NORTH, Zonal.EAST, 47, 37, 0, 122, 20, 0));
		towns.add(new Town("San Francisco", "USA", 
				Meridional.NORTH, Zonal.EAST, 37, 47, 0, 122, 20, 0));
		
		
		Collections.sort(towns);
		System.out.println(towns);
	}
}