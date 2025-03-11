package basicpgm;
class ParentClass
{
   static void add()
   {
	  int a= 10;
	  int b=20;
	  int sum = a + b;
	  System.out.println(sum);
   }
}
 public class Student_Class extends ParentClass 
 {
   static void sub()
   {
	  int a= 30;
	  int b=20;
	  int sub = a - b;
	  System.out.println(sub);
   }
   public static void main(String[] args) 
   {
	  sub();
	  add();
}
}
      
