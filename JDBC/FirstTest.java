import java.sql.*;

class FirstTest
{
	public static void main(String[] args)
	{
		try
		{
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection 
			String url = "jdbc:mysql://localhost:3306/collage1";
			String user = "root";
			String pass = "";
			Connection con =DriverManager.getConnection(url, user, pass);

			if (con.isClosed()) {
				System.out.println("connection is closed");

				
			}
			else
			{
				System.out.println("Connection created..");
			}


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}