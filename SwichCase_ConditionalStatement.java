//WAP on switch case statement
package basicpgm;
public class SwichCase_ConditionalStatement 
{
public static void main(String[] args) 
{
	switch (1)
	{
	case 1: System.out.println("Launch Chrome browser");
	    //    break;             //used to stop the execution if we have not use then it will execute next until next break
	case 2: System.out.println("Launch Firebox browser");
	   //     break;
	case 3: System.out.println("Launch Egde browser");
	        break;
	case 4: System.out.println("Launch safari browser");
	        break;
	default: System.out.println("Sorry your selection is wrong, please select 1, 2, 3, 4 only");                             //its not mandatory , keyword in java        
	
	}	
}
}
