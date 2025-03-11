package basicpgm;
public class Constructor 
{
   Constructor(int a, int b)
   {
	  System.out.println("This is my constuctor");
   }
	Constructor(String a)
	{
		System.out.println("name");
	}
	Constructor(int a, double b)
	{
		System.out.println("This is my 2nd constuctor");
	}
	public static void main(String[] args) 
	{
		new Constructor(5,6);
		new Constructor("Mau");
		new Constructor(10, 3.45);
	}
	
	
	
}
