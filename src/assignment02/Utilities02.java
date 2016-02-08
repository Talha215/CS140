package assignment02;

import java.util.Arrays;

public class Utilities02 
{
	public static int countNulls(Object[] array)
	{
		if(array == null || array.length == 0)
			return 0;
		
		int counter = 0;
		for(Object obj: array)
			if(obj == null)
				counter++;
		return counter;
	}
	
	public static int countSpaces(String str)
	{
		int counter = -1;
		if(str != null)
		{			
			counter = 0;
			for(int i = 0; i < str.length(); i++)
				if(str.charAt(i) == ' ')
					counter++;
		}
		return counter;
	}
	
	public static String first(String str)
	{
		String retVal = null;
		if(str != null)
		{
			retVal = str.trim();
			int i = retVal.indexOf(' ');
			if(i >= 0)
				retVal = retVal.substring(0, i);
		}
		return retVal;
	}
	
	public static String rest(String str)
	{
		String retVal = null;
		if(str != null)
		{
			retVal = str.trim();
			int i = retVal.indexOf(' ');
			if(i >= 0)
				retVal = retVal.substring(i + 1).trim();
			else
				retVal = "";
		}
		return retVal;
	}
	
	public static String withoutExtraSpaces(String str)
	{
		String retVal = null;
		if(str != null) 
		{
			retVal = str.trim();
			int len1 = 0, len2 = 0;
			do
			{
				len1 = retVal.length();
				retVal = retVal.replace("  ", " ");
				len2 = retVal.length();
			}while(len2 < len1);
		}
		return retVal;
	}
	
	public static String[] splitOnSpaces(String str)
	{
		int len = countSpaces(withoutExtraSpaces(str));
		String[] retVal = null;
		
		if(len >= 0)
		{
			retVal = new String[len + 1];
			for(int i = 0; i < retVal.length; i++)
			{
				retVal[i] = first(str);
				str = rest(str);
			}
		}
		return retVal;
	}
	
	public static int[] strLengths(String str)
	{
		int[] retVal = null;
		String[] words = splitOnSpaces(str);
		
		int i = 0;
		if(words != null)
		{
			i = words.length;
			retVal = new int[i];
			
			for(int j = 0; j < i; j++)
			{
				retVal[j] = words[j].length();
			}
		}
		return retVal;
	}
	
	public static String[] splitOnSpaces1(String str)
	{
		String[] retVal = null;
		if (str != null) 
		{
			retVal = new String[str.length()];
			int index = 0;
			while(str.length() > 0)
			{
				retVal[index] = first(str);
				str = rest(str);
				index++;
			}
			retVal = Arrays.copyOf(retVal, index);
		}
		return retVal;
	}
}
