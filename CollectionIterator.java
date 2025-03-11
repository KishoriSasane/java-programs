package basicpgm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionIterator 
{
public static void main(String[] args) 
{
	Collection<Integer> c1=new ArrayList<Integer>();  
	c1.add(89);
	c1.add(76);
	c1.add(99);
	c1.add(101);
	System.out.println(c1);
	
	Iterator i1= c1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
}
}
