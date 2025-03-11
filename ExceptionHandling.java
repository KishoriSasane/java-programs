package basicpgm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling 
{
  public static void main(String[] args) 
  {
	try {
		 Scanner s1=new Scanner(System.in);
		 System.out.println("Please enter your age");
		int age = s1.nextInt();
	}
	
	 catch(InputMismatchException m1)
	 {
		 try {
		 Scanner s1=new Scanner(System.in);
		 System.out.println("Please enter your age that must be number");
		 int age = s1.nextInt();
		 }
		 catch(InputMismatchException a1)
		 {
			 Scanner s1=new Scanner(System.in);
			 System.out.println("Enter the correct age");
			 int age = s1.nextInt();
		 }
	 } 		 
}   
}
