package basicpgm;

import java.util.Scanner;

public class ScannerAreaOfCircle 
{
	static double pi= Math.PI;
    public static void main(String[] args) 
    {
		Scanner S1=new Scanner(System.in);
		System.out.println("enter the value of area");
		double b = S1.nextDouble();
		System.out.println("Enter the value of radius");
		double radius  = S1.nextInt();
		double area = Math.PI * radius * radius;
		System.out.println(area);
	
		System.out.println("Enter the value of circle");
		double c = S1.nextDouble();
		System.out.println("Enter the value of radius");
		double radius1  = S1.nextInt();
		double pi  = S1.nextDouble();
		double circumferance = 2* Math.PI* radius;
		System.out.println(area + circumferance );
		S1.close();
		
	}
}
