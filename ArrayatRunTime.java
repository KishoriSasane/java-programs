package basicpgm;

import java.util.Scanner;

public class ArrayatRunTime 
{
public static void main(String[] args) 
{ 
	Scanner S1=new Scanner(System.in);
	System.out.println("enter the value of array");
	int age[] = new int [S1.nextInt()];
	
	for(int i=0; i<age.length;i++)
	{
		System.out.println("Please enter the value at index "+i);
		age[i] = S1.nextInt();
		
	}
    
    
}
}
