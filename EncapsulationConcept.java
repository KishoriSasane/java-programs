//Write A Program on Encapsulation
package basicpgm;
class Encapprogram1          //created one class let's assume it come from different package
{
	private String emailid="surajsasane@gmail.com";
	public String getEmailid()    //get/fetching the value(getEmailid - camal case E capital)
	{
		return emailid;           //use void when you don't have return statement 
	}
	public void setEmailid(String emailid)  // set the value (with the help of parameterized concept)
	{
	    this.emailid=emailid;    //updating the value of local variable to global variable
	}
	//another example
	private int age = 40;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
}

public class EncapsulationConcept 
{
public static void main(String[] args) 
{
	Encapprogram1 e1=new Encapprogram1();
	e1.setEmailid("rasharai@gmail.com");
	System.out.println(e1.getEmailid());
	e1.setAge(32);
	System.out.println(e1.getAge());
}
}
