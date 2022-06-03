package jdbcMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class programTwo {
	public static void main(String[] atgs) {
		try {
			// Connection Dynamic Operations
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			System.out.println("Connected Succesfully"+conn);
			
			/*
			 * Insert 
			 * Scanner sc=new Scanner(System.in); System.out.println("Id"); int d=
			 * sc.nextInt(); System.out.println("Name"); String name = sc.next();
			 * System.out.println("Address"); String address = sc.next();
			 * System.out.println("Phone"); String pho = sc.next(); PreparedStatement ps =
			 * conn.prepareStatement("insert into studentinfo values(?,?,?,?)");
			 * ps.setInt(1, d); ps.setString(2, name); ps.setString(3, address);
			 * ps.setString(4, pho); int i = ps.executeUpdate();
			 */
			
			/*Update 
			 * Scanner sc=new Scanner(System.in); System.out.println("Id"); int
			 * d=sc.nextInt(); System.out.println("Name"); String name = sc.next();
			 * System.out.println("address"); String address = sc.next(); PreparedStatement
			 * ps =
			 * conn.prepareStatement("update studentinfo set name=?, address=? where id=?");
			 * ps.setString(1, name); ps.setString(2, address); ps.setInt(3, d); int i =
			 * ps.executeUpdate();
			 */
			
//			Delete 
			  Scanner sc=new Scanner(System.in); System.out.println("Id"); int
			  d=sc.nextInt(); PreparedStatement ps =
			  conn.prepareStatement("delete from studentinfo where id=?"); ps.setInt(1, d);
			  int i = ps.executeUpdate();
			  if(i==1) {
				  System.out.println("Succes");
			  }else {
				  System.out.println("Not Succes");
			  }
			 
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
