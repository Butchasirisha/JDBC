package JdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class IndirectConnection {

	public static void main(String[] args) throws SQLException {
		
	Connection con=Jdbc.getMysqlconnection();
	Statement st=con.createStatement();
	ResultSet rSet=st.executeQuery("select * from emp where age=29");
	while(rSet.next())
	{
		System.out.println(rSet.getString(1)+"\n"  +  rSet.getString(2));
	}
	
	
			}
}