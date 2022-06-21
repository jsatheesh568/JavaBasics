package in.satheeshtech.interfac;

public class MyOracleDriver implements ConnectDB {

	@Override
	public void connect() {
		System.out.println("Connecting myOracle Driver.....");
	}

	@Override
	public void use() {
		System.out.println("using myOracle Driver.....");

	}

	@Override
	public void disconnect() {
		System.out.println("disconnecting myOracle Driver.....");

	}

}
