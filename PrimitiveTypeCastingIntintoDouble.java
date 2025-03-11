//WAP to convert int into double using both implicitly and explicitly
package basicpgm;

public class PrimitiveTypeCastingIntintoDouble 
{
public static void main(String[] args) 
{ 
	//convert int into double
	//Widening (Implicit and explicitly type)
	double d1=100;
	System.out.println(d1);   //Implicit way
	
	double d2=198;
	System.out.println(d2);   //Explicit way syntax
	
	//WAP to convert double into int (Narrowing can be done in Explicitly)  converting big-small
	int k1= (int) 3.14;
	System.out.println(k1);	
	
}
}
