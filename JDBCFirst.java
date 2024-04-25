import java.sql.*;
class JDBCFirst
{
	public static void main(String[] args)
	{
		String jdbcdDriver="com.mysql.cj.jdbc.Driver";
		String dburl="jdbc:mysql://localhost:3306/aits";
		String user="root";
		String pass="jkclab";
		Connection conn=null;
		Statement stmt=null;
		try
		{
			Class.forName(jdbcDriver);
			System.out.println("Connecting to the database....");
			conn=DriverManager.getConnection(dburl,user,pass);
			System.out.println("Creating a database.....");
			stmt=conn.createStatement();
			if(stmt!=null)
			{
				System.out.println("connection established..");
				String sqlq="create table studentaits(sno int,sname varchar(20),branch varchar(20))";
				stmt.executeUpdate(sqlq);
				System.out.println("Table created successfully..");
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
		