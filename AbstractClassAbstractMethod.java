package basicpgm;
abstract class ParentClass1     // Abstract class
{
	 abstract void add();   //Abstract methods
	 abstract void sub();
}

public class AbstractClassAbstractMethod extends ParentClass1
{  
	void add() 
	{
	   	System.out.println("Hello Java");	
	}

	
	void sub() 
	{
	 System.out.println("My name is");	
		
	}
  public static void main(String[] args) 
  {
	  AbstractClassAbstractMethod obj = new AbstractClassAbstractMethod();
	    obj.add();
	    obj.sub(); 
}
}
