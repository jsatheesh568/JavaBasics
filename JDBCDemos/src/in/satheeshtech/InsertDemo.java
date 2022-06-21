package in.satheeshtech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		// !. Collect the DB information
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/empdb";
		String userName = "root";
		String password = "root";

		// 2. Register the driver
		Class c = Class.forName(driverClassName);
		System.out.println(c);
		
		//3. Getting the connection object
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println(con);
		
		//4. Create statement object and execute query
		
		String sql = "insert into employees(name,contact) values ('Lakshika','9843977311')";
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		System.out.println("Success!!");
		
		//5. Release resources
		
		stmt.close();
		con.close();

	}

}
