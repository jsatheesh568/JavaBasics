package in.satheeshtech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UpdateDemo {

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
		
		String sql = "update employees set name=? where id =?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,"Harshana");
		pstmt.setInt(2, 4);
		pstmt.execute();
		System.out.println("Success!!");
		
		//5. Release resources
		
		pstmt.close();
		con.close();

	}

}
