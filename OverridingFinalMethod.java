package basicpgm;
class Amazon_Cap
{
	final void login()
	{
		System.out.println("Login to mail Id using mobile number");
	}
}
public class OverridingFinalMethod extends Amazon_Cap
{
	void login_with_mailid()
	{
		
		System.out.println("Login to mail Id using Email ID");
	}
	public static void main(String[] args) 
	{
		OverridingFinalMethod  S1=new OverridingFinalMethod ();
		S1.login();
		S1.login_with_mailid();
	}
}
