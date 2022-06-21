package in.satheeshtech.customexceptions;

public class InvalidAccountNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This will create InvalidAccountNumberException object without error message.
	 */

	public InvalidAccountNumberException() {
		super();
	}

	/**
	 * This will create InvalidAccountNumberException object with error message.
	 */

	public InvalidAccountNumberException(String errorMsg) {
		super(errorMsg);
	}

}
