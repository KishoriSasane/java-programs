package basicpgm;
class Amazon
{
	Amazon(String name)
	{
		System.out.println("This is my grandparent constructor");
	}
}
class Amazon1 extends Amazon
{
	Amazon1(String name,String psw)
	{
		super("Neha");
		System.out.println("This is my parent constructor");
	}
}

	public class SuperCalling_Para  extends Amazon1
	{
		SuperCalling_Para()     
	{
		super("Suraj", "Kish@123");
		System.out.println("This is my child constructor");
	}
public static void main(String[] args)
{
	new SuperCallingStatementNonPara();
}
}