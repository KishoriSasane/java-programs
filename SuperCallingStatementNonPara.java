package basicpgm;
class Amazon
{
	Amazon()
	{
		System.out.println("This is my grandparent constructor");
	}
}
class Amazon1 extends Amazon
{
	Amazon1()
	{
		System.out.println("This is my parent constructor");
	}
}

	public class SuperCallingStatementNonPara  extends Amazon1
	{
	   SuperCallingStatementNonPara()     
	{
		super();
		System.out.println("This is my child constructor");
	}
public static void main(String[] args)
{
	new SuperCallingStatementNonPara();
}
}
	
	
	

