package basicpgm;

import java.util.Scanner;

public class RectangleArea_Circumference 
{
    public static void main(String[] args) 
    {
	   Scanner S1=new Scanner(System.in);
	   System.out.println("Enter the value of length");
	   double L = S1.nextInt();
	   System.out.println("Enter the value of width");
	   double b= S1.nextInt();
	   double area = L * b;
	   System.out.println("The area of rectangle" + area);
	   
	   System.out.println("Enter the value of length");
	   double length = S1.nextInt();
	   System.out.println("Enter the width");
	   double width= S1.nextInt();
	   double Circumference = 2 * (length + width);
	   System.out.println("The circumference of the rectangle is: " + Circumference);
	   S1.close();
	   
	}
}
