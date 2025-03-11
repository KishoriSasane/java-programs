//WAP to sort List & Set
package basicpgm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortListSet 
{
public static void main(String[] args) 
{
	List<String> l1=new ArrayList<String>();
	l1.add("RAM");
	l1.add("Karn");
	l1.add("Shashi");
	l1.add("Brindha");
	l1.add("Akshay");
	System.out.println("Print the output: "+l1);
	Collections.sort(l1);    //Sorting can be done with the help of collection class
	System.out.println("After sorting-> "+l1);  
	
	Set<String> s1=new TreeSet<String>();
	s1.add("Suraj");
	s1.add("Rashmi");
	s1.add("Kishi");
	s1.add("Mansi");
	System.out.println("Sorted Set: "+s1);	
}
}
