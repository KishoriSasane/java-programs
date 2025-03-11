package basicpgm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperty 
{
public static void main(String[] args) 
{
  Set<Integer> s1=new HashSet<Integer>();
  s1.add(20);
  s1.add(89);
  s1.add(15);
  s1.add(24);
  s1.add(78);
   s1.add(35);
 //  s1.add(null);  //only one time it follow
   //Not follow the indexing, duplicate value, order of insertion
  System.out.println(s1);
  //WAP to iterate a Set using Iterator
  System.out.println("Set using Iteration starting:");
  
  Iterator<Integer> i1= s1.iterator();
  while(i1.hasNext())
  {
	 System.out.println(i1.next()); 
  }
}
}
