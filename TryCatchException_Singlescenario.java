package basicpgm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchException_Singlescenario 
{
public static void main(String[] args) 
{
	try {
	Scanner s1=new Scanner(System.in);
	System.out.println("Please enter the size of array");
	int rollno[] = new int[s1.nextInt()];
	}
	catch(InputMismatchException a1) 
	{
	
	}
	catch(NegativeArraySizeException a2)
	{
		
	}
}
}
