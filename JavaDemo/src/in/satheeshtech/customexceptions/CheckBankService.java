package in.satheeshtech.customexceptions;

public class CheckBankService {

	public static void main(String[] args) {
		BankService bankService = new BankService();
		try {
			bankService.withDraw(101, 2000);
		} catch (InvalidAccountNumberException e) {
			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}

	}

}
