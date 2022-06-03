package com.main;

import java.sql.Connection;
import java.util.Scanner;

import com.conn.DBConnect;
import com.doa.EmpDOA;
import com.entity.Emp;

public class deleteData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id :  ");
		int id = sc.nextInt();
		
		Connection conn = DBConnect.getConn(); // Connecting to another DbConncet package and makeing connection object
		Emp ep = new Emp();
		ep.setId(id);
		
		EmpDOA doa = new EmpDOA(DBConnect.getConn()); // Connecting DOA with database
		boolean f =doa.deletData(ep); // Call the Operation Method want to perform
		if(f) {
			System.out.println("Success");
		}else {
			System.out.println("Failed");
		}
	}
}
