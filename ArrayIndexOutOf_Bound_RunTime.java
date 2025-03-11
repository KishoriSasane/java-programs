//WAP on arrayindexoutofbounds expection with a try catch at Runtime
package basicpgm;

import java.util.Scanner;

public class ArrayIndexOutOf_Bound_RunTime 
{
public static void main(String[] args) 
{
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int array[]= new int [S1.nextInt()];
	System.out.print("Enter the element of first array: ");
	for(int i=0; i<=array.length-1;i++)
	{
		array[i]= S1.nextInt();
	}
	try 
	{
		System.out.println("Enter the index you want to access: ");
		int index= S1.nextInt();
		System.out.println("Element at index" + index +": "+ array[index]);

	}
	catch(ArrayIndexOutOfBoundsException a1)
	{
		System.out.println("Error: Index out of bounds! Please enter a valid index.");
	}	
}
}
