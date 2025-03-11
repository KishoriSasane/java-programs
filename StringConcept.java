package basicpgm;

public class StringConcept 
{
public static void main(String[] args) 
{
 	String a ="woker";
 	String b ="SURAJ";
 	System.out.println(a.toUpperCase());
 	System.out.println(b.toLowerCase());
 	
 	int a1= a.length();  //length concept
 	System.out.println(a1);
 	
 	String c="Kishori";
 	System.out.println(c.charAt(0));
 	System.out.println(c.charAt(5));   //chatAT(Character at the index position)
 	String d="          Student are good";    //Trim concept
 	System.out.println(d);
 	System.out.println(d.trim());
}
}
