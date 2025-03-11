package basicpgm;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArray_RunTime 
{
	
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);   //take the input from the user
	System.out.print("Enter size of first array: ");  //prompt message to give the user
	int array1[]=new int[s1.nextInt()];               //
	System.out.print("Enter the element of first array: ");
	for(int i=0; i<=array1.length-1; i++)
	{
		array1[i]=s1.nextInt();
	}
	
	System.out.print("Enter the size of second array: ");
	int array2[]= new int [s1.nextInt()];
	System.out.print("Enter the element of second array: ");
	for(int i=0; i<=array2.length-1;i++)
	{
		array2[i] = s1.nextInt();
	}
	
    if(Arrays.equals(array1, array2))
    {
    	System.out.println("Both arrays are equal. ");
    }
    else
    {
    	System.out.println("Both arrays are not equal. ");
    }
    s1.close();
}     
}
