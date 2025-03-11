package basicpgm;

public class Static_Parameterized_method 
{
     static void add(int a,int b)
     {
    	 int sum=a+b;
    	 System.out.println(sum);
     }
     static void sub(int c,int d)
     {
    	 int sub=d-c;
    	 System.out.println(sub);
     }
     static void student(String name)
     {
    	 System.out.println("Student 1");
     }
     public static void main(String[] args) 
     {
		add(5,10);
		sub(30,20);
		student("mansi");
	}
}
