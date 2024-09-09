package JdbcDemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Deleteval {

	public static void main(String[] args) {

		Connection connection=Jdbc.getMysqlconnection();
		try {
			Statement te=connection.createStatement();
			  String string2=("insert into user values('siri',56885,'siri@gmail.com')");
		String string1=("insert into user values('lavanya',598885,'lav@gmail.com')");
	  String string=("insert into user values('gomi',23885,'gomes@gmail.com')");
			te.addBatch(string);
			te.addBatch(string1);
			te.addBatch(string2);
			te.executeBatch();
			String delString="delete from user where name='siri'"; 
			te.execute(delString);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
