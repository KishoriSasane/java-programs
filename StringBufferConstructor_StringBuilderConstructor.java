package basicpgm;

public class StringBufferConstructor_StringBuilderConstructor 
{
public static void main(String[] args) 
{
	StringBuffer S1=new StringBuffer();  //Default constructor
	StringBuffer S2=new StringBuffer(50);
	StringBuffer S3=new StringBuffer("Hello ");
	S3.append(" Java");
//	S3.insert(5, " Welcome");
	System.out.println("Default constructor: "+S1);
	System.out.println(S2.capacity());
	System.out.println("String Buffer after append: "+ S3);
	
	StringBuilder SB=new StringBuilder("Shiv  Kumar");
    SB.insert(5, "Shankar");
    System.out.println("String Builder after insert: "+SB);
    StringBuilder S4=new StringBuilder("Gokhale Society");
    S4.replace(8, 15, "HAL");
    System.out.println("String Builder afer replacing: "+S4);	
}
}
