package in.satheeshtech.exceptionhandling;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println(exceptionTest());

	}
	 @SuppressWarnings("finally")
	public static int exceptionTest()
	  {
	   int i=6;
	   try{
	    throw new NullPointerException();
	   }
	   catch(NullPointerException e)
	   {
	    i=10;
	    throw e;
	   }
	   finally
	   {
	    i=20;
	    System.out.println("In finally block");
	    return i;
	   } 
	 
	  }

}
