package basicpgm;

import java.util.Arrays;

public class ArrayProgram1 
{
public static void main(String[] args)
{
	int [] age=new int [4];
	age [0]=50;
	age [1]=30;
	age [2]=21;
	age [3]=32;
	Arrays.sort(age);
	
	System.out.println(Arrays.toString(age));
	
}
}

//Array equals condition:
/* int [] rollno1=new int [4];
	rollno1 [0]=50;
	rollno1 [1]=30;
	rollno1 [2]=21;
	rollno1 [3]=32;
	int [] rollno2=new int [4];
	rollno2 [0]=50;
	rollno2 [1]=30;
	rollno2 [2]=21;
	rollno2 [3]=32;
	
boolean b1=	Arrays.equals.(rollno1, rollno2);
  sysout(b1)
*/  }
