import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_jdbc {
    public static void main(String[] args) throws Exception{
        int s_no=3;
        String name="jacob";
        String gander="Male";
        int age=25;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Nikhilg");
        PreparedStatement ps=com.prepareStatement("update my_table set gander=? where name=?");
        ps.setString(1, gander);
        ps.setString(2, name);
        int i=ps.executeUpdate();
        if (i>0) {
            System.out.println("successful");
        }else{
            System.out.println("unsuccessful");
        }
        com.close();
    }
}
