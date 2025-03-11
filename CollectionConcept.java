package basicpgm;
import java.util.ArrayList;
import java.util.Collection;
public class CollectionConcept 
{
public static void main(String[] args) 
{
	Collection<Integer> c1=new ArrayList<Integer>();  //<> wrapper class
	c1.add(89);
	c1.add(90);
	c1.add(99);
	c1.add(101);
	System.out.println(c1);
	
	Collection<Integer> k1=new ArrayList<Integer>();
	k1.add(78);
	k1.add(75);
	k1.addAll(c1);
	System.out.println(k1);
	
	
	Collection<Double> c2=new ArrayList<Double>();
	c2.add(34.99);
	c2.add(89.66);
	c2.add(77.89);
	c2.add(44.99);
	System.out.println(c2);
	
	Collection<String> c3=new ArrayList<String>();
	c3.add("Ram");
	c3.add("Kirna");
	c3.add("Nupur");
	System.out.println(c3);
	
	// Char method
	Collection<Character> c4=new ArrayList<Character>();
	c4.add('R');
	System.out.println(c4);
	
	//Boolean method
	Collection<Boolean> c0=new ArrayList<Boolean>();
	c0.add(true);
	System.out.println(c0);
	
	
 //  Collection c1=new ArrayList();  //upcasting 
   //Add method (Parameter is object)
 //  c1.add(true);
 //  c1.add("Kavya");
 //  c1.add('R');
 //  c1.add(55.60);
 //  c1.add(46460);
 //  System.out.println(c1);
   //Add all (Parameter is collection)
//   Collection c2=new ArrayList();
 //  c2.add("Kishna");
 //  c2.add("Kiran");
 //  c2.addAll(c1);   //trying to add C1 in C2
	
}
}
