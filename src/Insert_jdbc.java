import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_jdbc {
    public static void main(String[] args) throws Exception {

        int s_no =3;
        String name="111";
        String gander ="fem11ale";
        int age=25; 
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbc_db", "root", "Nikhilg");
        PreparedStatement ps=com.prepareStatement("insert into my_table values(?,?,?,?)");
        ps.setInt(1, s_no);
        ps.setString(2, name);
        ps.setString(3, gander);
        ps.setInt(4, age);
        int i=ps.executeUpdate();
        if(i>0){
            System.out.println("Sccuessful");
        }else{
            System.out.println("unsccuessful");
        }
        com.close();
    }
}
