package basicpgm;
public class StringBuffer_Apend_Insert_Delete 
{
public static void main(String[] args) 
{
	// Append method
	StringBuffer S1= new StringBuffer ("Suraj");
	S1.append(" Sunil Sasane");
	System.out.println(S1);
	
	//Insert method
	StringBuffer S2= new StringBuffer ("Vishal "); // give space
	S2.insert(6, " Rai");
	System.out.println(S2);
	
	//Replace method
	StringBuffer S3= new StringBuffer ("Krish Kumar tiwari");
	System.out.println(S3.replace(12, 18, "Gavit"));  //12-17
	
	//Delete method
//	System.out.println(S3.delete(12, 18));
	//Reverse method
	StringBuffer S4= new StringBuffer("Gokhale Society");
	System.out.println(S4.reverse());
	//Substring Method with Single parameter
	System.out.println(S3.substring(12));
	//Substring Method with double parameter
	System.out.println(S3.substring(0, 11));
	
	//Capacity
	StringBuffer SK=new StringBuffer("Hello Java");
	System.out.println(SK.capacity());
	
	//Remove
	System.out.println(SK.delete(6, 10));
	

}
}
