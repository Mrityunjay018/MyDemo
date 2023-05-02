package p2;

public class Demo3 {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded");
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver not loaded");
		}
		

	}

}
