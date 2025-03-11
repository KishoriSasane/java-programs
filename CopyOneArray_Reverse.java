//WAP to copy one array into another array in reverse order
package basicpgm;
import java.util.Arrays;
public class CopyOneArray_Reverse 
{ 
	public static void main(String[] args) 
	{
		 int array1[] =new int[4];
		    array1[0]=44;
		    array1[1]=20;
		    array1[2]=33;
		    array1[3]=25;
		    
		    int reverse[]= new int [array1.length];
		    for(int i=0, j=3; i<=array1.length-1; i++, j--)
		    {
		    	reverse[j] = array1[i]; // assigning the value of array to reverse
		    }
		    
		    System.out.println("Input arrays:-> "+Arrays.toString(array1));
		    System.out.println("Reverse arrays:-> "+Arrays.toString(reverse));		    
	}
}
/* i= 0 1 2 3
 * j= 3 2 1 0 
 */

