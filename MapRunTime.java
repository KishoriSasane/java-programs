//WAP to store account number, account holder name inside Map by passing the values at runtime for both account number, account holder.
package basicpgm;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MapRunTime 
{
public static void main(String[] args) 
{
	Map<Long,String> m1 = new HashMap<Long, String> ();
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter the number of accounts: ");
	int n = S1.nextInt();  //Taking number of accounts as input
	
	for(int i=0; i<n; i++)
	{
		System.out.println("Enter account number: ");
		long accountnumber  = S1.nextLong();
		System.out.println("Enter account holder name : ");
		String accountholder = S1.next();
		m1.put(accountnumber, accountholder);
    }		
}
   }

