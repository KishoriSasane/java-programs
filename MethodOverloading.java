package basicpgm;

public class MethodOverloading 
{
   static void add(int a, int b)
   {
	   System.out.println("1"); 
   }
   static void add(double a, int b)
   {
	  System.out.println("2");  
   }
   void add(String a, char b)
   {
	  System.out.println("name");  
   }
   void add(String a)
   {
	   System.out.println("snehal");
   }
   
   public static void main(String[] args) 
   {
	 add(5, 10);
	 add(4.8, 17);
	 MethodOverloading m1=new MethodOverloading();
	 m1.add("Vrushali", 'K');
	 m1.add("Yogita");
	 
}
} 


