package basicpgm;

public class StringBuilder_AppendInsertDeleteReplace 
{
public static void main(String[] args) 
{
	//Append Method
	StringBuilder S1=new StringBuilder("Sujita");
	S1.append(" Kumar Rai");
	System.out.println(S1);
	//Insert Method
	StringBuilder S2=new StringBuilder("Kishori Sunil ");
//	System.out.println(S2.insert(13, " Sasane"));
	//Delete method
	System.out.println(S2.delete(8, 13));
	//Substring Method
	StringBuilder S3= new StringBuilder ("Krish Kumar Rai");
	System.out.println(S3.substring(12));   //with Single parameter
	System.out.println(S3.substring(6, 15));
	//Reverse
	StringBuilder S= new StringBuilder ("HAL High School");
//	System.out.println(S.reverse());
	//Replace method
	System.out.println(S.replace(9, 15, "Society"));
	//Capacity
	StringBuilder SK=new StringBuilder("Hello Java");
	System.out.println(SK.capacity());
	
	//Remove
	System.out.println(SK.delete(6, 10));	
}
}
