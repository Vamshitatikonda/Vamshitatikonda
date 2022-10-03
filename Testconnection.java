package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
public class Testconnection {
	private static Connection conn1=null;
public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
        conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","cfg@1234");
        System.out.println("connected "+conn1);
		 } catch (Exception e) {
				System.out.println(e);
			}
		return conn1;
	}
}
