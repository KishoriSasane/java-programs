package basicpgm;

public class Global_Variable_staticnonstatic 
{
	int a=10;
    static double c=8.9;
    static String name="Kishori";
    
    static void add()
    {
    	int a=30;
    	System.out.println(a);
    	System.out.println("Kishori");
    	double c=10.5;
    	System.out.println(c);
    	Global_Variable_staticnonstatic k1=new Global_Variable_staticnonstatic();
       System.out.println(k1.a);
    }
       
       void sub()
    {
    	double d=8.88;
    	int a=40;
    	System.out.println(d);
    	System.out.println(a);
    	
    }
       public static void main(String[] args) 
       { 
    	   add();
    	   Global_Variable_staticnonstatic k2=new Global_Variable_staticnonstatic();
    	   k2.sub();		
	   }	
}
    
    
    
       
