package basicpgm;

import java.util.Scanner;

public class SquareArea 
{
   public static void main(String[] args) 
   {
	  Scanner S1=new Scanner(System.in);
	  System.out.println("Enter the value of a"); 
	  double a= S1.nextDouble(); 
	  System.out.println("Enter the value b");
	  double b =S1.nextDouble();
	  double area = a * b;
	  System.out.println("The area of square: " +area);
	  
	  System.out.println("Enter the value of side ");
	  double side = S1.nextDouble();
	 double Circumference = 4 * side;
	 System.out.println("The circumference of square: " +Circumference);
	  S1.close();	   
}
}
