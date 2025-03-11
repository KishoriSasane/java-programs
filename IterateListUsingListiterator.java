//WAP to iterate a List using List iterator
package basicpgm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class IterateListUsingListiterator 
{
public static void main(String[] args) 
{
	//iterate a List using Iterator
	List<String> l1=new ArrayList<String>();
	l1.add("Sanjay");
	l1.add("allan");
	l1.add("Vishal");
	l1.add("Mansi");
	l1.add(0, "Shiv");
	System.out.println("Iteration starting: ");
	System.out.println(l1);
	
	Iterator<String> i2=l1.iterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	
	//iterate a List using List iterator
	System.out.println("ListIeration Starting: ");
	ListIterator<String> i3= l1.listIterator();
	System.out.println("Forward Iteration:");
	while(i3.hasNext())
	{
		System.out.println(i3.next());
	}
	System.out.println("Backword Iteration:");  //Backword iteration is only possible when forward iteration is done
	while(i3.hasPrevious())
	{
		System.out.println(i3.previous());
	}
}
}
