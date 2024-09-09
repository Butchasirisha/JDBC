package JdbcDemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Updateval {

	public static void main(String[] args) {
		Connection connection=Jdbc.getMysqlconnection();
		try {
			Statement te=connection.createStatement();
			String upString="update user set email='lavs@gmail.com' where name='lavanya'"; 
			te.execute(upString);
	}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}
}