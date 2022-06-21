package in.satheeshtech.exceptionhandling;

public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println(exceptionTest());

	}
	public static int exceptionTest()
	  {
	   int i=6;
	   try{
	    return i*2;
	   }
	   catch(Exception e)
	   {
	    i=10;
	    System.out.println("In Catch block");
	   }
	   finally
	   {
	    System.out.println("In finally block");
	   } 
	   return i*5;
	  }

}
