//WAP on Enumeration
package basicpgm;

import java.util.Vector;

public class Enumeration 
{
public static void main(String[] args) 
{
	Vector v=new Vector();
	v.add(10);
	v.add("Kiran");
	v.add(18.9);
	java.util.Enumeration e= v.elements(); //v=vector is used add elements, V is ref variable of vector
	//v.elemets return type is enumeration and e will you two abstract method hasMoreElements, nextElement
	
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
}	
}
