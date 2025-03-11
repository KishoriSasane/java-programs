package basicpgm;

public class Teacher_HIT extends Parent_HIT
{
   void ShowRole()
   {
	 System.out.println("Role: Teacher");  
   }
   public static void main(String[] args) 
   {
	  Teacher_HIT S1=new Teacher_HIT();
	  S1.role();
	  S1.ShowRole();
}
}

