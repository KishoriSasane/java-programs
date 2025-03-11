package basicpgm;

import java.util.HashMap;
import java.util.Map;

public class MapKeys 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(11332277, "Soumya");
		m1.put(33556861, "Twinkle");
		m1.put(87877176, "Rithika");
		m1.put(65625262, "Brindha");
		m1.put(44826181, "Priya");
		System.out.println(m1);
		System.out.println("Fetching all the keys:");
		for(Integer i1: m1.keySet())
		{
			System.out.println(i1);
		}
}
}
