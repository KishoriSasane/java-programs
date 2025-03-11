//WAP to count the number of alpahebets, numeric letters,spaces and special characters used in the given String  
package basicpgm;

import java.util.Arrays;

public class Alpha_Number_SpaceArray 
{
public static void main(String[] args) 
{
	// To count the number of alphabets
	int count_of_alphabet=0;
	int count_of_digit=0;
	int count_of_space=0;
	String s1="Kishori 1234 &";  //[k,i,s,h, ,s,s, ,2,0,3]
	char C1 [] =s1.toCharArray();
//	System.out.println(Arrays.toString(C1));
	
 
  for(int i=0; i<=C1.length-1; i++)
  {
	  boolean b1=  Character.isAlphabetic(C1[i]);  //alphabetic
	  boolean b2=  Character.isDigit(C1[i]);       //numbers
	  boolean b3= Character.isWhitespace(C1[i]);   //count the spaces
	  if(b1==true)       //b1 equal to true and count of alphabet is increased
	  {
		  count_of_alphabet++;  //incrementing the count of alphabet variable by 1
		 
	  }
	  if(b2==true)
	  {
		  count_of_digit++;
	  }
	  if(b3==true)
	  {
		  count_of_space++;
	  }
  }
	 int countofspecialchar= s1.length() - (count_of_alphabet+count_of_digit+count_of_space); //count of special characters
	  System.out.println("Special characters are-> "+countofspecialchar); 
  
  System.out.println("Alphabets are-> "+count_of_alphabet);
  System.out.println("Digits are-> "+count_of_digit);
  System.out.println("Spaces are-> "+count_of_space);
}
}
