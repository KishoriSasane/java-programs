package basicpgm;
class Parent
{
	Parent(int number)
   {
		super();
		String name;
	    int age;
	   System.out.println("This is my nubmer");  
   }
}
class child extends Parent
{
	child(String designation)
	{
		super("Yogita@123);
		 System.out.println("This is my child"); 
	}
}

public class SuperCallingPara1 extends child 
{
	SuperCallingPara1(String psw)
	{
		 System.out.println("This is my "); 
	}
	public static void main(String[] args) 
	{
		new SuperCallingPara1();
	}
}
