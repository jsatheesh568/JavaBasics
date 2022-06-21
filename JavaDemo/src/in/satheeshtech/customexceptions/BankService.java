package in.satheeshtech.customexceptions;

public class BankService {
	
	int balance = 5000;
	public void withDraw(int accNo, int amount) throws InvalidAccountNumberException,InsufficientBalanceException {
		if(accNo != 101) {
			throw new InvalidAccountNumberException("Your Account number is not Valid");
		}
		if(amount > balance) {
			throw new InvalidAccountNumberException("Please maintain the sufficient balance");
		}
		System.out.println("Amount withdrawn from : "+accNo);
		System.out.println("Initial Balance : "+balance);
		balance = balance - amount;
		System.out.println( "Amount Withdrawn : "+amount);
		System.out.println("Available Balance : "+balance);
		
	}

}
