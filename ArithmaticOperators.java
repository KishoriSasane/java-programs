package basicpgm;

public class ArithmaticOperators 
{
	static void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}	
	static void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	
  public static void main(String[] args) 
  
{
	add();// this is how we call the static method
	sub();
	mul();
}

}
