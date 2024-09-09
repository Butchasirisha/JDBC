package JdbcDemo;

import java.sql.*;

public class Jdbc {
	static Connection connection = null;

	public  Connection  getMysqlconnection() {
		String urlString = "jdbc:mysql://localhost:3306/siri";
		String unString = "root";
		String pswdString = "pass123";
		try {
			connection = DriverManager.getConnection(urlString, unString, pswdString);
			
				if (connection != null) {
					System.out.println("created");
				} else {
					System.out.println("denied");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return connection;
		

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Class.forName("com.mysql.jdbc.Driver");

		// 
		// st.executeQuery("select * from Student where roll=1");

		Jdbc connectionJdbc = new Jdbc();
		connectionJdbc.getMysqlconnection();

	}

}
