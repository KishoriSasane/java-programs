package basicpgm;

public class StringPalindrome 
{
	public static void main(String[] args) 
	  {
		String input = "mom";
		String reverse="";    //store the value
		
		for(int i=input.length()-1; i>=0; i--)
		{
		char C1 =   input.charAt(i);
		reverse=reverse +C1;	
		}
		System.out.println(reverse);	
		if(input.equals(reverse))
		{
			System.out.println("Given word is Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}
	}

