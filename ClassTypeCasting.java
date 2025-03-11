//WAP on Class Typecasting to achive Upcasting(in implicit and explicit way) and Downcasting
package basicpgm;

public class ClassTypeCasting 
{
  public static void main(String[] args) 
  {
	//Upcasting type
	Object o1=  new ClassTypeCasting();  // upcasting need to find the parent class property only 
	//Implicit syntax ...converting the child class object into sub class type
	
	Object o2= (Object) new ClassTypeCasting(); //Explicitly syntax
	
	//Downcasting type
	ClassTypeCasting u1 = (ClassTypeCasting) o1; //Downcasting in explicit way
		  
}
}
