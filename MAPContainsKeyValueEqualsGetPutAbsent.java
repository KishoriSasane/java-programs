//Assignment 101:
//WAP on MAP using methods like get(), containsKey(), containsValue(), putIfAbsent(), equals()
package basicpgm;

import java.util.HashMap;
import java.util.Map;

public class MAPContainsKeyValueEqualsGetPutAbsent 
{
public static void main(String[] args) 
{
	Map<Integer,String> m1=new HashMap<Integer,String>();
	m1.put(11332277, "Soumya");
	m1.put(33556861, "Twinkle");
	m1.put(87877176, "Rithika");
	m1.put(65625262, "Brindha");
	m1.put(44826181, "Priya");
	m1.putIfAbsent(98981918, "Priya");   //put if absent check only specified key
	System.out.println(m1);
boolean b1=	m1.containsKey(33556861);    // containsKey() method
System.out.println(b1);
  boolean b2=    m1.containsValue("Twinkle");   //containsValue() method
  System.out.println(b2);
  Map<Integer,String> m2=new HashMap<Integer,String>();
	m2.put(11332277, "Soumya");
	m2.put(33556861, "Twinkle");
	m2.put(87877176, "Rithika");
	m2.put(65625262, "Brindha");
	m2.put(44826181, "Priya");
boolean b3=	m1.equals(m2);    //equals() method
  System.out.println(b3);
 String s1= m1.get(65625262);   //fetching the key value , get method
 System.out.println(s1);
}
}
