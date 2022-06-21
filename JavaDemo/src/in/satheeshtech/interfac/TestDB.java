package in.satheeshtech.interfac;

import javax.swing.JOptionPane;

public class TestDB {

	public static void main(String[] args) throws Exception {
		ConnectDB con;
		//con= new MyOracleDriver();  // Tight Coupling
		String driverClassName = JOptionPane.showInputDialog("Enter Driver Class Name :");
		Class c = Class.forName("in.satheeshtech.interfac."+driverClassName);
		con = (ConnectDB)c.newInstance();
		con.connect();
		con.use();
		con.disconnect();

	}

}
