package basicpgm;
import java.util.ArrayList;
import java.util.Collection;
public class CollectionConceptRemove 
{
	public static void main(String[] args) 
	{
		Collection<Integer> c1=new ArrayList<Integer>();  //<> wrapper class
		c1.add(89);
		c1.add(90);
		c1.add(99);
		c1.add(101);
		System.out.println("Before removing->" + c1);
		c1.remove(101);
		System.out.println("After removing->" + c1);
		
		Collection<Integer> k1=new ArrayList<Integer>();
		k1.add(78);
		k1.add(75);
		k1.removeAll(c1);
		System.out.println(k1);
		
		
		Collection<Double> c2=new ArrayList<Double>();
		c2.add(34.99);
		c2.add(89.66);
		c2.add(77.89);
		c2.add(44.99);
		c2.remove(77.89);
		System.out.println(c2);
		
		Collection<String> c3=new ArrayList<String>();
		c3.add("Ram");
		c3.add("Kirna");
		c3.add("Nupur");
	    c3.remove(c2);
		System.out.println(c3);
		
		// Char method
		Collection<Character> c4=new ArrayList<Character>();
		c4.add('R');
		c4.remove('R');
		System.out.println(c4);
		
		//Boolean method
		Collection<Boolean> c0=new ArrayList<Boolean>();
		c0.remove(true);
	System.out.println(c0);

}
}

