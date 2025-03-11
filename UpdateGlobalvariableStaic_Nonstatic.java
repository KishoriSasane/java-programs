package basicpgm;

public class UpdateGlobalvariableStaic_Nonstatic 
{
    static double c=80.9;
    int b=100;
    
	public static void main(String[] args) 
  {
	 c=90.5; 
	 System.out.println(c);
	 UpdateGlobalvariableStaic_Nonstatic k1=new UpdateGlobalvariableStaic_Nonstatic();
	 k1.b=200;
	 System.out.println(k1.b); 
	 
}
}
