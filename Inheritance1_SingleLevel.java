package basicpgm;

public class Inheritance1_SingleLevel extends Inheritance2
{
   static void add()
   {
	  int a=10;
	  int b=30;
	  int sum = a+b;
	  System.out.println(sum);
   }
   
   public static void main(String[] args) 
   {
	 sub();
	 add(); 
   
}
}
