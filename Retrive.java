package mavenjdbc;
import java.sql.*;
public class Retrive {
	public static void main(String[] args) throws Exception {
	
		Connection conn=Testconnection.getConnection();
		System.out.println(conn);
		Statement st=conn.createStatement();
		ResultSet r=st.executeQuery("select * from emphy");
		ResultSetMetaData rm=r.getMetaData();
		System.out.println(rm.getColumnName(1)+" "+rm.getColumnName(2)+" "+rm.getColumnName(3));
		while(r.next()) {
			System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getString(3));
		}
		
	}

}
