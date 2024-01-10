
package university.management.system;
import java.sql.*;

public class ConnectionDatabase 
{
    Connection c;
    Statement s;

   ConnectionDatabase()
   {
      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           c=DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem", "root", "W@2915djkq#");
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}
