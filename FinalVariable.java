package basicpgm;

public class FinalVariable 
{
   /* final static double pi=3.14;
    public static void main(String[] args) 
    {
		 System.out.println(pi);
	}*/
	


     
   static void areaofcircle()
   {
	  final double pi=3.14;
	   int radius=7;
	   double area=pi*radius*radius;
	   System.out.println(area);
   }
   public static void main(String[] args) 
   {
	 areaofcircle();
    }
 }
	
