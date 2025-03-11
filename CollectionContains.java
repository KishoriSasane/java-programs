package basicpgm;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionContains 
{
public static void main(String[] args) 
{
	Collection<Integer> c1=new ArrayList<Integer>();  
	c1.add(89);
	c1.add(90);
	c1.add(99);
	c1.add(101);
	
	boolean k2= c1.contains(52);
	System.out.println(k2);
	
	
	Collection<Integer> k1=new ArrayList<Integer>();
	k1.add(78);
	k1.add(75);
	boolean b1= k1.containsAll(c1);
	System.out.println(b1);
	
	
	Collection<Double> c2=new ArrayList<Double>();
	c2.add(34.99);
	c2.add(89.66);
	c2.add(77.89);
	c2.add(44.99);
	boolean b2= c2.containsAll(k1);
	System.out.println(b2);
	
	Collection<String> c3=new ArrayList<String>();
	c3.add("Ram");
	c3.add("Kirna");
	c3.add("Nupur");
	boolean b3=c3.contains("Ram");
	System.out.println(b3);
	
	// Char method
	Collection<Character> c4=new ArrayList<Character>();
	c4.add('R');
	c4.add('K');
	boolean b=c4.contains('R');
	System.out.println(b);
	
	//Boolean method
	Collection<Boolean> c0=new ArrayList<Boolean>();
	c0.add(true);
	boolean r1=c0.containsAll(c4);
	System.out.println(r1);
	
}
}
