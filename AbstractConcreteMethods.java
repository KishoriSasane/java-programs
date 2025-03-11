package basicpgm;
abstract class URL1
{
	abstract void add();  //abstract method
	abstract void sub();
	void login()              //Concrete methods
	{
		System.out.println("Logic to expose");
	}
	static void logout()      //Concrete methods
	{
		System.out.println("Logic to expose");
	}
	
}
public class AbstractConcreteMethods extends URL1
{
	void add()
	{
		System.out.println("Logic to keep");
	}
	void sub()
	{
		System.out.println("Logic to keep");
	}
	
   public static void main(String[] args) 
   {
	   AbstractConcreteMethods s1=new AbstractConcreteMethods();
	   s1.add();
	   s1.sub();
	   s1.login();
	   
	   
}
}
