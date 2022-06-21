package in.satheeshtech.exceptionhandling;

public class ExceptionTest3 {

	public static void main(String[] args) {
		System.out.println(exceptionTest());

	}
	@SuppressWarnings("finally")
	public static int exceptionTest()
	  {
	   int i=6;
	   try{
	    i=50;
	    return i;
	   }
	   finally
	   {
	    i=20;
	    System.out.println("In finally block I value :"+i);
	   //return i*2;
	   } 
	 
	  }
}
