package basicpgm;

import java.util.Scanner;

public class Triangle 
{
   public static void main(String[] args) 
   {
	 Scanner S1=new Scanner(System.in);
	 System.out.println("Enter the base of triangle");
	 double base = S1.nextInt();
	 System.out.println("Enter the height of triangle");
	 double height= S1.nextInt();
	 double area = 0.5 * base * height;
	 System.out.println("The area of triangle" + area);
	 
	 System.out.println("Enter the value of a"); 
	 double a = S1.nextDouble();
	 System.out.println("Enter the value of b");
	 double b = S1.nextInt();
	 System.out.println("Enter the value of c");
	 double c = S1.nextDouble();
	 double circumference = a + b + c;
	 System.out.println("The circumference of trinagle" + circumference);
	 
	 S1.close();	 
}
  
   
}

