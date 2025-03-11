package basicpgm;

public class MatchesFunction 
{
public static void main(String[] args) 
{
	String a ="Pratik";
	boolean b1 = a.matches("......");
	System.out.println(b1);
	
	//String end with k
	boolean b2= a.matches("(.)*"); //represent multi char
	System.out.println(b2);
	
	//starting with P or not
	boolean b3= a.matches("P(.)*"); //represent multi char
	System.out.println(b3);
	
	//check if the given string have man in it
    String b= "Superman";
    boolean b4= b.matches("(.)*man(.)*");
    System.out.println(b4);
}
}
