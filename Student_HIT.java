package basicpgm;

public class Student_HIT extends Parent_HIT
{
   void showRole()
   {
	  System.out.println("Role: student");  
   }
   public static void main(String[] args) 
   {
	   Student_HIT S1=new Student_HIT();
	   S1.role();
	   S1.showRole();
}
}
