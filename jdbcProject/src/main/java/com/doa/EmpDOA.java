// DOA File is Perform Operation on Data -> than make main file of operation and Execute
package com.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Emp;

public class EmpDOA {
	private Connection conn;
	//Connection Class
	public EmpDOA(Connection conn) {
		this.conn = conn;
	}
	// Insert Method
	public boolean dataInsert(Emp emp) {
		boolean f=false;
		try {
			PreparedStatement ps= conn.prepareStatement("insert into emp values(?,?,?,?)");
					ps.setInt(1, emp.getId());
					ps.setString(2, emp.getName());
					ps.setString(3, emp.getAddress());
					ps.setString(4, emp.getPho());
					
					int a = ps.executeUpdate();
					if(a==1) {
						f=true;
					}
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	// Update Method
	public boolean editData(Emp emp) {
		boolean f=false;
		
		try {
			PreparedStatement ps= conn.prepareStatement("update emp set name=?,address=? where id=? ");
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getAddress());
			ps.setInt(3, emp.getId());
			int a = ps.executeUpdate();
			if(a==1) {
				f=true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	// Delete
	public boolean deletData(Emp emp) {
		boolean f=false;
		
		try {
			PreparedStatement ps= conn.prepareStatement("delete from emp where id=? ");
			ps.setInt(1, emp.getId());
			int a = ps.executeUpdate();
			if(a==1) {
				f=true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	// Select
	public Emp getInfo(int id) {
		Emp obj = null; // Setting obj value is null
		try {
			PreparedStatement ps= conn.prepareStatement("Select * from emp where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			// It will print the output of data in table one-by-one  
			while(rs.next()) 
			{
				obj=new Emp();// Check if data is avaliable than create object
				obj.setId(rs.getInt(1));
				obj.setName(rs.getString(2));
				obj.setAddress(rs.getString(3));
				obj.setPho(rs.getString(4));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	public List<Emp> getDataList(){
		List<Emp> list = new ArrayList<Emp>();
		Emp em = null;
		try {
			PreparedStatement ps= conn.prepareStatement("Select * from emp");
			ResultSet rs = ps.executeQuery();
			// It will print the output of data in table one-by-one  
			while(rs.next()) 
			{
				em=new Emp();// Check if data is avaliable than create object
				em.setId(rs.getInt(1));
				em.setName(rs.getString(2));
				em.setAddress(rs.getString(3));
				em.setPho(rs.getString(4));
				list.add(em);			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
