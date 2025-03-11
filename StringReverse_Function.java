package basicpgm;

public class StringReverse_Function 
{
  public static void main(String[] args) 
  {
	String input = "School";
	String reverse="";    //store the value
	
	for(int i=input.length()-1; i>=0; i--)
	{
	char C1 =	input.charAt(i);
	reverse=reverse +C1;
		
	}
	System.out.print(reverse);	
}
}

// Reverse concept
/* i=5
  char C1 =	input.charAt(i);
 reverse=reverse +C1;
 C1=l
 reverse=l
 i=4
 c1=o
 reverse=l+o =lo
 i=3
 c1=o
 reverse=lo+o=loo
 i=2
 c1=h
 reverse=loo+h=looh
 
 
 */
