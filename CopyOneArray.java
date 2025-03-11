//WAP to copy one array into another array 
package basicpgm;

import java.util.Arrays;

public class CopyOneArray 
{
public static void main(String[] args) 
{
	int array1[]= new int[4];
	array1[0]=20;
	array1[1]=44;
	array1[2]=32;
	array1[3]=66;
	
	int array2[]= new int [array1.length];
	for(int i=0; i<array1.length; i++)   //i<=array1.length-01 (if equal then -1)
	{
	    array2[i]=array1[i];	
	}
	System.out.println("Input arrays:-> " +Arrays.toString(array1));
	System.out.println("Output arrays:-> "+Arrays.toString(array2));
	
}
}
