package basicpgm;

public class GlobalvariablesStatic_nonstatic 
{
     static int a=10;
     int b=20;
     
     static void add()
     {
    	 a=100;
    	 System.out.println(a);
    	 GlobalvariablesStatic_nonstatic k1=new GlobalvariablesStatic_nonstatic();
    	 System.out.println(k1.b=200); 
     }
     void add1()
     {
    	 a=300;
    	 b=400;
    	 System.out.println(a);
    	 System.out.println(b);
     }
     public static void main(String[] args) 
     {
		add();
		GlobalvariablesStatic_nonstatic k2=new GlobalvariablesStatic_nonstatic();
		k2.add1();
     }
}
