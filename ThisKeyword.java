package basicpgm;

public class ThisKeyword 
{
	String name1;
	double salary;
	int age;
	void worker_details(String name1,double salary,int age)
	{
		this.name1=name1;
		this.salary=salary;
		this.age=age;		
	}

public static void main(String[] args) 
{
	  ThisKeyword S1=new ThisKeyword();
	  S1.worker_details("Suraj", 95000, 30);
	  System.out.println(S1.name1);
	  System.out.println(S1.salary);
	  System.out.println(S1.age);	  
}
}
