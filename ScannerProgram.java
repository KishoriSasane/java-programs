package basicpgm;
import java.util.Scanner;
public class ScannerProgram 
{
     //public static void main(String[] args) 
	/*  {  
    	 Scanner S1=new Scanner(System.in);
    	 System.out.println("Please enter the value of a");
    	 int a = S1.nextInt();
    	 System.out.println("Please enter the value of b");
    	 int b = S1.nextInt();
    	 int sum = a+b;
    	 System.out.println(sum);
    	 S1.close();
   }    */
   
    	 static void add(int a, int b)
    	 {
    		int sum= a+b;	
    		System.out.println(sum);
    	 }
    	 static void sub(int a, int b)
    	 {
    		int sub= a-b;	
    		System.out.println(sub);
    	 }
    	 
    	 public static void main(String[] args) 
    	 {
			Scanner S1=new Scanner(System.in);
			int a= S1.nextInt();
			int b= S1.nextInt();
			add(a,b);
			sub(a,b);
			S1.close();
		}
}
