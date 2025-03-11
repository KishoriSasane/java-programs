package basicpgm;
class Google_Cap
{
	void login()
	{
		System.out.println("Login to mail Id using mobile number");
	}
}
public class Method_Override extends Google_Cap
{
	void login()
	{
		
		System.out.println("Login to mail Id using Email ID");
	}
	public static void main(String[] args) 
	{
		Method_Override S1=new Method_Override();
		S1.login();
	}
}
