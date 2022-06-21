package in.satheeshtech.customexceptions;

public class InsufficientBalanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This will create InvalidAccountNumberException object without error message.
	 */

	public InsufficientBalanceException() {
		super();
	}

	/**
	 * This will create InvalidAccountNumberException object with error message.
	 */

	public InsufficientBalanceException(String errorMsg) {
		super(errorMsg);
	}

}
