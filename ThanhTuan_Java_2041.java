/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thanhtuan_java_20.pkg4.pkg1;

import java.sql.*;

/**
 *
 * @author Administrator
 */
public class ThanhTuan_Java_2041 {

    private static final String url = "jdbc:mysql://localhost:3306/quanlinhanvien";
    private static final String user = "root";
    private static final String pass = "";

    public static void main(String[] args)  {
        try(Connection con = DriverManager.getConnection(url, user, pass)) 
        {
            xuatdsquanlinv(con);
        }catch(SQLException e)
        {
            e.printStackTrace();
        }

    }

    public static void xuatdsquanlinv(Connection con) throws SQLException {
        String sql = "Select * From nvdilam";
        try (Statement sm = con.createStatement()) {
            ResultSet rs = sm.executeQuery(sql);
                        System.out.println("+-----+-------------------+------------+------+---------");
            System.out.println("|id |hoten       | luong      | songaylam");
            System.out.println("+-----+-------------------+------------+------+---------");

           // in thong tin sach tu result
            while (rs.next()) {
            int id = rs.getInt("id");
            String hoten = rs.getString("hoten");
            float luong = rs.getFloat("luong");
            int songaylam = rs.getInt("songaylam");          
            System.out.format("|%-4d|%-34s|%-24f|%-6.2d|%n", id, hoten, luong, songaylam);
        }
             System.out.println("+-----+-------------------+------------+------+---------");
        }
        
        
    }

}
