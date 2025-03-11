package basicpgm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapKeysValues 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(11332277, "Soumya");
		m1.put(33556861, "Twinkle");
		m1.put(87877176, "Rithika");
		m1.put(65625262, "Brindha");
		m1.put(44826181, "Priya");
		System.out.println("Fetching all the keys and values:");
		for(Entry<Integer, String> s4: m1.entrySet())  //return type entry set is- set of entry of object,object
		{
			System.out.println(s4);
		}
		
}
}
