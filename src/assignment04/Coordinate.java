package assignment04;

public class Coordinate implements Comparable<Coordinate>
{
	private Meridional northSouth;
	private Zonal eastWest;
	private int mDegrees; // m for Meridional
	private int mMinutes;
	private int mSeconds; 
	private int zDegrees; // z for Zonal
	private int zMinutes;
	private int zSeconds;
	
	public Coordinate(Meridional nS, Zonal eW, int mDeg, int mMin, int mSec, int zDeg, int zMin, int zSec)
	{
		northSouth = nS;
		eastWest = eW;
		mDegrees = mDeg;
		mMinutes = mMin;
		mSeconds = mSec;
		zDegrees = zDeg;
		zMinutes = zMin;
		zSeconds = zSec;
	}
	
	private int howMuchWest()
	{
		if(eastWest == Zonal.EAST)
			return -1 * (zDegrees * 60 * 60 + zMinutes * 60 + zSeconds);
		return zDegrees * 60 * 60 + zMinutes * 60 + zSeconds;
	}
	
	private int howMuchSouth()
	{
		if(northSouth == Meridional.NORTH)
			return -1 * (mDegrees * 60 * 60 + mMinutes * 60 + mSeconds);
		return mDegrees * 60 * 60 + mMinutes * 60 + mSeconds;
	}

	//test this later
	public int compareTo(Coordinate arg0) 
	{
		int n = howMuchWest() - arg0.howMuchWest();
		if(n == 0)
			return howMuchSouth() - arg0.howMuchSouth();
		return n;
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof Coordinate && compareTo((Coordinate)obj) == 0);
	}
}
