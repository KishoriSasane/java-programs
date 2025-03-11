package basicpgm;

import java.util.InputMismatchException;

public class ThrowKeyword 
{
public static void main(String[] args) throws NullPointerException,InputMismatchException //Declared thrown
{
	if(1>3)
	{	
	throw new NullPointerException();  //throw keyword
	}
	else
	{
		throw new InputMismatchException();
	}
}
}
