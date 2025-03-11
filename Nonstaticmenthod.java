package basicpgm;

public class Nonstaticmenthod 
{
     void addition()
     {
    	 int a=20;
    	 int b=50;
    	 int sum=a+b;
    	 System.out.println(sum);
     }
     void sub()
     {
    	 int a=200;
    	 int b=100;
    	 int sub=b-a;
    	 System.out.println(sub);
     }
     void mul()
     {
    	 int a=30;
    	 int b=100;
    	 int mul=a*b;
    	 System.out.println(mul);
     }
     
     public static void main(String[] args) 
     {
    	 Nonstaticmenthod n=new Nonstaticmenthod();
    	 n.addition();
    	 n.sub();
    	 n.mul();
	}
    			
     }