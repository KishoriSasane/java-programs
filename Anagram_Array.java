//Write A Program to find out if the given 2 strings are anagram  
package basicpgm;

import java.util.Arrays;

public class Anagram_Array 
{
public static void main(String[] args) 
{
	String K1="earth";
	String K2="heart";
	
	if(K1.length()!= K2.length())
	{
		System.out.println("They are not anagram");
	}
	else
	{
		System.out.println("Lets find out if they are anagram");
		
		char C1[]= K1.toCharArray(); //[C,A,T]
		char C2[]=K2.toCharArray(); //[A,C,T]
		
		Arrays.sort(C1);
		Arrays.sort(C2);
		System.out.println("After sorting C1: ");
		System.out.println(C1);
		System.out.println("After sorting C2: ");
		System.out.println(C2);
		
	boolean b1=	Arrays.equals(C1, C2);
	System.out.println(b1);
	
	if(b1==true)
	{
		System.out.println("It is anagram");
	}
	else
	{
	   System.out.println("Not anagram");	
	}		
	}
}
}
