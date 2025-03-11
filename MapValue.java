package basicpgm;

import java.util.HashMap;
import java.util.Map;

public class MapValue 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(11332277, "Soumya");
		m1.put(33556861, "Twinkle");
		m1.put(87877176, "Rithika");
		m1.put(65625262, "Brindha");
		m1.put(44826181, "Priya");
		System.out.println("Fetching all the values:");
		
		for(String s1: m1.values()) //For each loop to print the individual values and return type is
		{                            //return type of values collection of object
			System.out.println(s1);   //return type of for each loop is collection of string
		}
		
}
}

