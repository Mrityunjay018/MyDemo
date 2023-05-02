package p2;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2 
{
	public static void main(String args[])
	{
		try
		{
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver Loaded");
			
		}
		catch(SQLException e)
		{
			System.out.println("Driver not loaded");
		}
	}

}
