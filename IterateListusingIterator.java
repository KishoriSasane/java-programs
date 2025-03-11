package basicpgm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateListusingIterator 
{
public static void main(String[] args) 
{
	//WAP to iterate a List using Iterator
	List<String> l1=new ArrayList<String>();
	l1.add("Sanjay");
	l1.add("allan");
	l1.add("Vishal");
	l1.add("Mansi");
	l1.add("Vrushali");
	l1.add(0, "Shiv");
	System.out.println("Iteration starting: ");
	System.out.println(l1);
	
	Iterator<String> i2=l1.iterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	
}
}
