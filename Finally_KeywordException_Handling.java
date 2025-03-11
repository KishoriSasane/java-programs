package basicpgm;

public class Finally_KeywordException_Handling 
{
public static void main(String[] args) 
{
	try 
	{
	int a=10;
	int b=0;
	int result=a/b;
	System.out.println("Result: " + result);
	}
	catch(ArithmeticException a1)
	{
	  System.out.println("Divion by 0 is not allowed"); 
	}
	finally
	{
		System.out.println("Finally Block");
	}
}

}
