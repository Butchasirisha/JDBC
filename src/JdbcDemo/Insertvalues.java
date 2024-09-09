package JdbcDemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertvalues {

	public static void main(String[] args) {
		
		Connection connection=Jdbc.getMysqlconnection();
		try {
			Statement te=connection.createStatement();
			te.executeUpdate("insert into user values('siri',56885,'siri@gmail.com')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
