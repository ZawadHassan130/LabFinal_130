import java.sql.*;
public class ConnectionProvider {
    public static Connection getCon()
    {
        try {
            String url="jdbc:mysql://localhost:3306/HealthcareMangaementSystem";

            String uname="root";
            String pass="4521317117";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            con.setAutoCommit(true);

            return con;
        }catch(Exception e) {
            return null;
        }
    }

}