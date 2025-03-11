package basicpgm;

public class StaticNonstatic_method 
{
       static void add()
      {
    	  int a=100;
    	  int b=200;
    	  System.out.println(a+b);	
      }
      static void sub()
      {
    	  int a=50;
    	  int b=30;
    	  int c=b-a;
    	  System.out.println(c);	
      }
      void mul()
      {
    	  int a=50;
    	  int b=30;
    	  int c=b*a;
    	  System.out.println(c);	
      }
      void div()
      {
    	  int a=150;
    	  int b=30;
    	  int c=b/a;
    	  System.out.println(c);	
      }
        public static void main(String[] args) 
        {
			add();
			sub();
			StaticNonstatic_method k=new StaticNonstatic_method();
			k.mul();
			k.div();
			
		}
}

