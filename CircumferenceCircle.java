package basicpgm;

import java.util.Scanner;

public class CircumferenceCircle 
{
	double pi = Math.PI;
     public static void main(String[] args) 
     {
    	 Scanner S1=new Scanner(System.in);
 		System.out.println("Enter the value of radius");
 		double radius  = S1.nextInt();
 		double area = Math.PI * radius * radius;
 		System.out.println("The area of circle "+ area);
 		
        System.out.println("Enter the value of radius");
 		double radius1  = S1.nextInt();
 		double circumferance = 2 * Math.PI * radius1;
 		System.out.println("The circumfernce of circle " +circumferance );
 		S1.close();
     }
}






