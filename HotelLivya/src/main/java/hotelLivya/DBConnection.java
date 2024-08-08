package hotelLivya;

import java.sql.*;

public class DBConnection 
{
	public static Connection con = null;
	public DBConnection()
	{
	}
	static
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(DBInfo.url, DBInfo.username, DBInfo.password);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static Connection DBgetConnection()
	{
		return con;
	}
}
