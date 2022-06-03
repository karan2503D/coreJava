package com.main;

import java.sql.Connection;
import java.util.Scanner;

import com.conn.DBConnect;
import com.doa.EmpDOA;
import com.entity.Emp;

public class insertDataMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id :  ");
		int id = sc.nextInt();
		System.out.println("Enter Name :  ");
		String name = sc.next();
		System.out.println("Enter Address :  ");
		String address = sc.next();
		System.out.println("Enter Phone :  ");
		String pho = sc.next();
		
		Connection conn = DBConnect.getConn(); // Connecting to another DbConncet package and makeing connection object
		Emp ep = new Emp();
		ep.setId(id);
		ep.setName(name);
		ep.setAddress(address);
		ep.setPho(pho);
		
		EmpDOA doa = new EmpDOA(DBConnect.getConn());
		boolean f =doa.dataInsert(ep);
		if(f) {
			System.out.println("Success");
		}else {
			System.out.println("Failed");
		}
	}
}
