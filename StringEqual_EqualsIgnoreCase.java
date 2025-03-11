package basicpgm;

public class StringEqual_EqualsIgnoreCase 
{
public static void main(String[] args) 
{
	String input= "mango";
	boolean b1 = input.equals("mango");
	System.out.println(b1);
	
	boolean b2 = input.equalsIgnoreCase("MANGO");
	System.out.println(b2);
	
}
}
