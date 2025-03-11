package basicpgm;
interface Amazon_1
{
	void methodA();
	void methodB();	
}
interface Amazon_2 extends Amazon_1
{
	void methodC();
	void methodD();	
}
public class MultipleLevelInheritance implements Amazon_2 
{
 public static void main(String[] args) 
 {
	 MultipleLevelInheritance S1=new MultipleLevelInheritance();
	 S1.methodA();
	 S1.methodB();
	 S1.methodC();
	 S1.methodD();
 }
public void methodA() 
{
	System.out.println("Interface A");
	
}
public void methodB() 
{
	System.out.println("Interface B");
}
public void methodC() 
{
	System.out.println("Interface C");
}
public void methodD() 
{
	System.out.println("Interface D");
	
}
}
