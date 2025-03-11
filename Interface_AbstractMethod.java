package basicpgm;
interface Google1
{
	void add();
	void sub();
}
public class Interface_AbstractMethod implements Google1 
{
 public static void main(String[] args) 
 {
	 Interface_AbstractMethod S1=new Interface_AbstractMethod();
	 S1.add();
	 S1.sub();
}
public void add() 
{
	System.out.println("Hello");
}


public void sub() 
{
	System.out.println("Sneha");
}
}
