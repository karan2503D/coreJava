package com.main;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.conn.DBConnect;
import com.doa.EmpDOA;
import com.entity.Emp;

public class showData {

	public static void main(String[] args) {
		
		EmpDOA doa = new EmpDOA(DBConnect.getConn()); // Connecting DOA with database
		/*
		 * 	Scanner sc = new Scanner(System.in);
         *	System.out.println("Enter Id :  ");
         *	int id = sc.nextInt();
		 * Emp em =doa.getInfo(id); 
		 * if(em==null) { System.out.println("User Not Avaliable"); }else {
		 * System.out.println("Name="+em.getName()+ " " +"Address="+em.getAddress()+" "
		 * + "Phone="+em.getPho()); }
		 */
		List<Emp> list= doa.getDataList();
		for(Emp e:list) {
			System.out.println("Name="+e.getName() + " " +"Address="+ e.getAddress()+" " + "Phone="+e.getPho());
		}
		
	}

}
