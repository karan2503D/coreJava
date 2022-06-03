package jdbcMysql;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class programOne {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			System.out.println("Connected Succesfully"+conn);
			
			
			// Insert Statement - PreparedStatement ps= conn.prepareStatement("insert into studentinfo values(?,?,?,?)"); ps.setInt(1, 123);ps.setString(2, "Name");ps.setString(3, "address");ps.setString(4, "pho");
			// update statement - PreparedStatement ps=conn.prepareStatement("update studentinfo set name=?, address=?, pho=? where id=?");ps.setString(1, "Abc");ps.setString(2, "address2");ps.setString(3, "123456789");ps.setInt(4, 121);
			// Delete Statement - PreparedStatement ps=conn.prepareStatement("delete from studentinfo wher id=?");ps.setInt(1, 123);
			
			/*Select Statement			
			 * PreparedStatement ps=conn.prepareStatement("select * from studentinfo ");
			 * ResultSet rs = ps.executeQuery(); while(rs.next()) { System.out.println("Id="
			 * + rs.getInt(1) + "Name=" + rs.getString(2) + "Address=" + rs.getString(3) +
			 * "pho=" + rs.getString(4)); }
			 */
			
			
			
			
			
			// For Regular operations int i = ps.executeUpdate(); System.out.println("Data Deleted Succesfullly");
			conn.close(); 
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
