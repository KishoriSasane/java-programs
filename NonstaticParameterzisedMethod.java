package basicpgm;

public class NonstaticParameterzisedMethod 
{
     void add(int a, int b)
     {
    	 System.out.println("addition");
     }
     void sub(int c, int d)
     {
    	 System.out.println("subtraction");
     }
     void student(boolean a, double b)
     {
    	 System.out.println("Student");
     }
     void multiply(int c, int d)
     {
    	 System.out.println("multiplication");
     }
     
      public static void main(String[] args)
      {
		  
    	  NonstaticParameterzisedMethod n=new NonstaticParameterzisedMethod();
    	  n.add(10,20);
    	  n.sub(90,100);
    	  n.student(true,3.457);
    	  n.multiply(4, 5);
	}
} 
