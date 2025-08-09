package Day13;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.mysql.cj.xdevapi.Statement;
// 1.We need to import a package
// 2 load and register the driver - com.mysql.jdbc.driver
// 3 establish the connection
// 4 create the statements
// 5 execute the query
// 6 process results
// 7 close the connection
public class JDBC_Example {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/JDBC_DEMO";
		String userName="root";
		String pwd="1329";
		String query="select * from students";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,userName,pwd);
		Statement st=con.createStatement();
//		st.executeQuery(query);
		ResultSet rs=st.executeQuery(query);
		while (rs.next()) {		                   
            int id = rs.getInt(1) ;
            String name = rs.getString(2);
            System.out.println("ID is: " + id + ", Name is: " + name);
		}
		st.close();
		con.close();
	}
}
