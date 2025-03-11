//WAP on MAP concepts using its methods
package basicpgm;

import java.util.HashMap;
import java.util.Map;

public class MAPConcept 
{
public static void main(String[] args) 
{
   Map<Integer,String> m1=new HashMap<Integer,String>();	
   m1.put(541541988, "Reshma");      //Put methods(Object,object)
   m1.put(918101820, "Krishna");
   m1.put(651715171, "Sam");
   m1.put(726181616, "Ciya");
   m1.put(436171718, "Sayali");
   System.out.println(m1);
   
   Map<Integer,String> m2=new HashMap<Integer,String>();	
   m2.put(981018199, "Rehman");      //Put methods(Object,object)
   m2.put(881718171, "Sajid");
   m2.put(917191719, "Anna");
   m2.put(615717161, "Viviana");
   m2.put(514617181, "Mayuri");
   m2.putAll(m1);
   m2.remove(917191719);              //remove object key
   m2.remove(981018199, "Rehman");    //remove (Object key, Object value)
   m2.replace(881718171, "Suraj");   //replace(Integer Key and string value)
   m2.replace(615717161,"Viviana" , "Viviana Rai"); // replace Integer key, String oldValue, String newValue
 //  m2.clear();                     //clear method
/*  boolean b2= m2.isEmpty();        //is empty (checking the if it's empty or not)
  System.out.println(b2);
  */
   System.out.println(m2);
}
}
