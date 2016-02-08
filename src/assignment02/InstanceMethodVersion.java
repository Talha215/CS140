package assignment02;

import java.util.Arrays;

public class InstanceMethodVersion 
{
	private String string;
	
	public InstanceMethodVersion(String string)
	{
		this.string = string;
	}
	public int countSpaces()
	{
		int counter = -1;
		if(string != null)
		{			
			counter = 0;
			for(int i = 0; i < string.length(); i++)
				if(string.charAt(i) == ' ')
					counter++;
		}
		return counter;
	}
	
	public String first()
	{
		String retVal = null;
		if(string != null)
		{
			retVal = string.trim();
			int i = retVal.indexOf(' ');
			if(i >= 0)
				retVal = retVal.substring(0, i);
		}
		return retVal;
	}
	
	public String rest()
	{
		String retVal = null;
		if(string != null)
		{
			retVal = string.trim();
			int i = retVal.indexOf(' ');
			if(i >= 0)
				retVal = retVal.substring(i + 1).trim();
			else
				retVal = "";
		}
		return retVal;
	}
	
	public String withoutExtraSpaces()
	{
		String retVal = null;
		if(string != null) 
		{
			retVal = string.trim();
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
	
	public String[] splitOnSpaces()
	{
		withoutExtraSpaces();
		int len = countSpaces();
		String[] retVal = null;
		
		if(len >= 0)
		{
			retVal = new String[len + 1];
			for(int i = 0; i < retVal.length; i++)
			{
				retVal[i] = first();
				string = rest();
			}
		}
		return retVal;
	}
	
	public int[] strLengths()
	{
		int[] retVal = null;
		String[] words = splitOnSpaces();
		
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
	
	public String[] splitOnSpaces1()
	{
		System.out.println(string);
		String[] retVal = null;
		if (string != null) 
		{
			retVal = new String[string.length()];
			int index = 0;
			while(string.length() > 0)
			{
				retVal[index] = first();
				string = rest();
				index++;
			}
			retVal = Arrays.copyOf(retVal, index);
		}
		return retVal;
	}	
}
