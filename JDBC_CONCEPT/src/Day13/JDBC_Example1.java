package Day13;

import java.sql.*;

public class JDBC_Example1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/course_details"; //  Updated DB name
        String userName = "root";
        String pwd = "1329"; // Use your actual MySQL password

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL driver not found");
            e.printStackTrace();
            return;
        }

        // Connect and execute query
        try (Connection con = DriverManager.getConnection(url, userName, pwd);
             Statement st = con.createStatement()) {

            String query = "SELECT * FROM courses";
            try (ResultSet rs = st.executeQuery(query)) {
                while (rs.next()) {
                    String course = rs.getString("course_name");
                    int fee = rs.getInt("fees");
                    System.out.println("Course: " + course + ", Fees: " + fee);
                }
            }

        } catch (SQLException e) {
            System.out.println("Database operation failed");
            e.printStackTrace();
        }
    }
}