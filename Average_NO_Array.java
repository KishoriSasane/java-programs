package basicpgm;

public class Average_NO_Array 
{
public static void main(String[] args) 
{
   int [] rollno = new int[4];
   rollno[0] = 30;
   rollno[1] = 10;
   rollno[2] = 44;
   rollno[3] = 23;
   double sum=0;
   double average =0;
   
   for(int i=0; i<=rollno.length-1; i++)
   {
	  sum=sum+ rollno[i]; 
   }
	/* 
	 * i=0, sum 0+30 sum=30   // sum logic
	 * i=1, sum 30+10=40
	 * i=2, sum 40+44 =84
	 * i=3 sum 84 + 23 = 107   
	 */
   System.out.println(sum);
   average= sum/rollno.length;
   System.out.println(average);
}
}

