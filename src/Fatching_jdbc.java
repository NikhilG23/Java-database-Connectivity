import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fatching_jdbc {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Nikhilg");
        PreparedStatement ps=com.prepareStatement("select * from my_table");
        ResultSet rs=ps.executeQuery();
        System.out.println("Result:---------------------------------------");
        while (rs.next()) {
            System.out.print(rs.getInt("s_no"));
            System.out.print(" ");
            System.out.print(rs.getString("name"));
            System.out.print(" ");
            System.out.print(rs.getString("gander"));
            System.out.print(" ");
            System.out.print(rs.getInt("age"));
            System.out.println("");
        }
        com.close();
    }
}