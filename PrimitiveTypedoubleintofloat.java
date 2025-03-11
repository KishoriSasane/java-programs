package basicpgm;

public class PrimitiveTypedoubleintofloat 
{
public static void main(String[] args) 
{
	//WAP to convert double into float..Explicit conversion Narrowing concept
	float f1 = (float)9.8998;
/*  whatever you want to convert should be right hand side
	float f1 = (float) d1;  // 
	System.out.println("Double value: " + d1);
	System.out.println("Converted Float value: " + f1);	
	*/
	
	System.out.println(f1);
	
	//WAP to convert float into double
	    double b1=  81.1918;
	    System.out.println("Converting the double value: "+ b1);   //Widening implicit way
	
}
}
