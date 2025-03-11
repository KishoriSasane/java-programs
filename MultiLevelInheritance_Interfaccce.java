package basicpgm;
interface Base_Cap
{
	void method1();
	void method2();
}
interface Amazon_3 extends Base_Cap
{
	void method3();
	void method4();
}
public class MultiLevelInheritance_Interfaccce implements Amazon_3
{
public static void main(String[] args) 
{
	MultiLevelInheritance_Interfaccce S1=new MultiLevelInheritance_Interfaccce();
	S1.method1();
	S1.method2();
	S1.method3();
	S1.method4();
}

public void method1() 
{
	System.out.println("Base interface2");
}

public void method2() 
{
	System.out.println("Base interface1");	
}

public void method3() 
{
	System.out.println("Base interface3");
}

public void method4() 
{
	System.out.println("Base interface4");
	
}
}
