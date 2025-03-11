//WAP to iterate a MAP using Iterator
package basicpgm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterator 
{
public static void main(String[] args) 
{
	Map<Integer,String> m1=new HashMap<Integer,String>();
	m1.put(11332277, "Soumya");
	m1.put(33556861, "Twinkle");
	m1.put(87877176, "Rithika");
	m1.put(65625262, "Brindha");
	m1.put(44826181, "Priya");
//	System.out.println(m1);
	System.out.println("Fetching all the values:");
	
	for(String s1: m1.values()) //For each loop to print the individual values and return type is
	{                            //return type of values collection of object
		System.out.println(s1);   //return type of for each loop is collection of string
	}
	System.out.println("Fetching all the keys:");
	for(Integer i1: m1.keySet())
	{
		System.out.println(i1);
	}
	System.out.println("Fetching all the keys and values:");
	for(Entry<Integer, String> s4: m1.entrySet())  //return type entry set is- set of entry of object,object
	{
		System.out.println(s4);
	}
	System.out.println("Iterartion using Iterator:");
	Set<Entry<Integer,String>> s5= m1.entrySet();
	Iterator<Entry <Integer, String>> s6=  s5.iterator();
	while(s6.hasNext())
	{
		System.out.println(s6.next());
	}	
}      
}
