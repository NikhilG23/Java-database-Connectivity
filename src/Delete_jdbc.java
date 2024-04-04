import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_jdbc {
    public static void main(String[] args)throws Exception {
        String name="111";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Nikhilg");
        PreparedStatement ps=com.prepareStatement("delete from my_table where name=?");
        ps.setString(1, name);
        int i=ps.executeUpdate();
        if (i>0) {
            System.out.println("successfull");
        }else{
            System.out.println("unsuccessful");
        }
        com.close();

    }
}
