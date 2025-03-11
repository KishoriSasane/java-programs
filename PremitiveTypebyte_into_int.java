package basicpgm;

public class PremitiveTypebyte_into_int 
{
public static void main(String[] args) 
{
	//WAP to convert byte into int
	   int a1= 115;
	   System.out.println(a1);  //Implicit way 
	   int a2= 118;
       System.out.println(a2);  //Explicit way 
       
//WAP to convert int into byte   (Narrowing can be done in Explicitly)   
   byte b1=(byte) 98;
   System.out.println("Converted byte value: " + b1);
   
   //WAP to convert int into byte where int value is 10000
     byte b2 =(byte) 10000;
     System.out.println("Converted byte value: " + b2);
}
}
