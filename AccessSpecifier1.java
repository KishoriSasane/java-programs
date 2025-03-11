package basicpgm;

public class AccessSpecifier1 
{
	public static void add()
	{
		System.out.println("Accessible anywhere");
	}
	private static void sub()
	{
		System.out.println("Accessible only within this class");
	}
	 static void mul()
	{
		 System.out.println("Accessible within the same class");
	}
	protected static void div()
	{
		System.out.println("Accessible within the same class");
	}
	public static void main(String[] args) 
  {
	add();
	sub();
	mul();
	div();
}
}
