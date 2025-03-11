package basicpgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethod 
{
public static void main(String[] args) 
{
	List<String> l1 = new ArrayList<String>();
	l1.add("Alise");
	l1.add("Kiran");
	l1.add("Suchita");
	l1.add("Madhuri");
	l1.add("Neha");
	l1.add(0, "Pooja");
	System.out.println("Print the output: "+l1);
	Collections.sort(l1);       //Sorting can be done with the help of collection class
	System.out.println("After sorting-> "+l1);    
	
	List<String> l2 = new ArrayList<String>();
	l2.add("Kishori");
	l2.add("Kishori");
	l2.add("Monika");
	l2.add("Kavya");
//	l2.addAll(l1);
	l2.addAll(1, l1);
	System.out.println(l2);	
}
}
