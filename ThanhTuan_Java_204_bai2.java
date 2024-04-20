
package thanhtuan_java_20.pkg4;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class ThanhTuan_Java_204 {

    private static final String url = "jdbc:mysql://localhost:3306/quanlinhanvien";
    private static final String user = "root";
    private static final String pass = "";
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(url,user,pass))
    {
        boolean login = XacThuc(con, "thanh tuan","nhonaovay");
        if(login)
        {
            System.out.println("dang nhap thanh cong");
        }
        else
        {
            System.out.println("dang nhap ko thanh cong");
        }
    }catch(SQLException e)
    {
        e.printStackTrace();
    }
    }

    public static boolean XacThuc(Connection con, String username, String password) throws SQLException
    {
        String sql = "Select * From nhanvien Where username = ? AND password = ?";
        try(PreparedStatement ps = con.prepareStatement(sql))
        {
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rl = ps.executeQuery();
            return rl.next();
        }
    }
    
   
}
