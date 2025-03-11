package basicpgm;

public class This_Statment
{
   
	This_Statment()
	{
		this("Hello"); //this calling statement
		System.out.println("1");
	}
	This_Statment(String a)
	{
		this('A');
	  System.out.println("2");
	}
	This_Statment(char a)
	{
	  System.out.println("3");
	}
	public static void main(String[] args) 
	{
		new This_Statment();
	}
}
