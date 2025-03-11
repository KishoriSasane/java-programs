package basicpgm;

public class Updateglobalvariable 
{
     static int a=20;
     int c=40;
     static String name="Hello";
   
     static void add()
     {
       int a=30;
       System.out.println(a);
       name="Word";
       System.out.println(name);
     }
     public static void main(String[] args) 
     {
		add();
		Updateglobalvariable  k1=new Updateglobalvariable();
		k1.c=100;
		System.out.println(k1.c);
		
	}
     
}
