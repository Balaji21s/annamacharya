//JDBCCreate.java
import java.sql.*;
public class JDBCCreate{
    public static void main(String[] args){
        String jdbcDriver="org.postgresql.Driver";
	    String dbURL="postgresql://localhost:5432/aits";
	    String user="postgres";
	    String pass="jkclab";
	      Connection conn=null;
	      Statement stmt=null;
	      try{
	           Class.forName(jdbcDriver);
			   System.out.println("Connecting to database...");
			   conn=DriverManager.getConnection(dbURL,user,pass);
			   System.out.println("creating database...");
			   stmt=conn.createStatement();
			    if(stmt!=null){
			         System.out.println("connection established");
				     String sqlq="create table studentaits(rnum varchar(20),name varchar(20),branch varchar(20))";
				     stmt.executeUpdate(sqlq);
				     System.out.println("table created successfully...");
		        }
        }
       catch(ClassNotFoundException|SQLException e){
            e.printStackTrace();
       }
   }
}   
