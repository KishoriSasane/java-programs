//WAP to find out the current date, past date and future date using String function
package basicpgm;
import java.util.Date;
public class Date_UsingSubstring 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();          // Creating an object it calls the constructor
		System.out.println(d1);
		Date d2=new Date(d1.getTime()-1000*60*60*24*4);  // (+ symbol use for future date, - past date)
		System.out.println(d2);
		
		String format1= d2.toString();  // apply the string_function and return type string
		//DD-MM-YYYY
		//DD/MM/YYYY
		//substring with Single and double parameter
		String month= format1.substring(4, 7);
		System.out.println(month);
		String date= format1.substring(8, 10);   //double substring(middle and start index)
		System.out.println(date);
		String year= format1.substring(format1.length()-4);  //length of string -4 starting from 2 and single parameter substring use
		System.out.println(year);
		
		String format2= date.concat("-").concat(month).concat("-").concat(year);  //date format
		System.out.println(format2);
		String format3= date.concat("/").concat(month).concat("/").concat(year);  //current time
		System.out.println(format3);
	}

}
