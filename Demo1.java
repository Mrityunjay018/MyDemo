package p2;

import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class Demo1 {

	public static void main(String[] args) 
	{
		try 
		{
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver Loaded");
			
		}
		catch(SQLException e)
		{
			System.out.println("Driver Not Loaded");
		}

	}

}
