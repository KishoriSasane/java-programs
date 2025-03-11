package basicpgm;
class C2
{
	 static void one()
	 {
		int a= 10;
		int b= 20;
		int sum = a + b;
		System.out.println(sum);
		
	 }
}
   
class B extends  C2
{
	static void two()
	{
		int a= 40;
		int b= 20;
		int sub  = a + b;
		System.out.println(sub);
	}
}
public class Class_Assignment extends  B
{
	void three()
	{
		int a= 40;
		int b= 20;
		int mul  = a * b;
		System.out.println(mul);
	}
	public static void main(String[] args) 
   {
	   
		Class_Assignment S1=new Class_Assignment();
		S1.three();
	   two();
	   one();
}
}
