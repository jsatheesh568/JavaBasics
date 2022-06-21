package in.satheeshtech.interfac;

public class MySQLDriver implements ConnectDB {

	@Override
	public void connect() {
	System.out.println("Connecting mySQL Driver.....");

	}

	@Override
	public void use() {
		System.out.println("using mySQL Driver.....");

	}

	@Override
	public void disconnect() {
		System.out.println("Disonnecting mySQL Driver.....");

	}

}
