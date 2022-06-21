package in.satheeshtech.Basics;

public class DataType {

	public static void main(String[] args) throws Exception, IllegalAccessException {
		int a = 1000000;
		int b = -200000;
		int c = a + b;
		System.out.println(c);
		DataType dt = DataType.class.newInstance();
		System.out.println(dt);

		String phrase = "the cat is in the theatre";

		String result = phrase.replace("the", "a");
		System.out.println(result);

		int res = 31 % 4;
		System.out.println(res);

		String phone = "555-548-1254";
		System.out.println(phone.substring(3, 6));

		int aa = 7;
		int bb = 3;
		System.out.println(aa / bb);

		int cc = 50 - 8 * 2 / 4 - 8 + 3;
		System.out.println(cc);

		String name = "Bob wrote 3 Java programs.";
		String msg = name + " wrote " + 2 + 1 + " Java programs.";
		System.out.println(msg);

		String msg1 = "Bob wrote " + (2 + 1) + " Java programs.";
		System.out.println(msg1);

		// String msg2 = name + " wrote " + num " Java programs.";

		String msg3 = name + " wrote " + 3 + " Java programs.";
		System.out.println(msg3);

		int hoursNeeded = 5;
		int hoursAvailable = 5;
		int hoursRemaining;

		if (hoursAvailable > 0) {
			hoursRemaining = hoursAvailable - hoursNeeded;
			if (hoursRemaining < 0) {
				System.out.println("Not enough time.");
			} else {
				String suffix = "";
				if (hoursRemaining != 1) {
					suffix = "s";
				}

				System.out.println("You will have " + hoursRemaining + " hour" + suffix + " remaining.");
			}
		} else {
			System.out.println("Times up.");
		}

		int[] ages = { 2, 37, 48, 3, 5 };
		System.out.println(ages[2] + " " + ages[1]);

		String[] numbers = { "2", "3", "4", "5" };
		for (String number : numbers) {
			System.out.println(number);
		}
		System.out.println(exceptionTest());
	}
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
		    System.out.println("In finally block");
		    return i;
		   } 
	  }
}
