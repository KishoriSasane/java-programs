package basicpgm;

public class ReplaceMethods_String
{
    public static void main(String[] args) 
    {
		String name1= "Name is Kavya";
		String S1= name1.replace('v', 'n');  //char old char, char new char
		System.out.println(S1);
		
		String name2= "School name is HAL";
		String S2= name2.replace("HAL", "Gokhale");  //String-string[Char sequence target, char sequence replacement] 
		System.out.println(S2);
		
		String name3= "Kishori Sasane";
	    String K1= name3.replaceAll("[A-Z]", "" ); //In oder to replace all the capital letters
	    System.out.println(K1);
	    
	   
	    String K2= name3.replaceAll("[a-z]", "" ); //In oder to replace all the small letters
	    System.out.println(K2);
	    
	    String name4 ="HAL TYPE 1 313 Nashik";
	    System.out.println(name4.replaceAll("[0-9]", ""));  // replace the numeric value  	
    	
	}
}
