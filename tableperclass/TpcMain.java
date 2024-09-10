package com.mph.tableperclass;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TpcMain {

	public static void main(String[] args) {
		  SessionFactory sf=new Configuration().configure().buildSessionFactory();
		  Session session = sf.openSession();
		  Transaction txn = session.beginTransaction();
		  
		  SEmployee se=new SEmployee();
		  se.setId(100);
		  se.setName("pankaj");
		  
		  FullTimeEmployee fte=new FullTimeEmployee();
		  fte.setSalary(2100);
		  fte.setId(101);
		  fte.setName("ravira");
		  
		  PartTimeEmployee pte=new PartTimeEmployee();
		  pte.setHourlyrate(500);
		  pte.setId(102);
		  pte.setName("hag");
		  
		  session.save(se);
		  session.save(pte);
		  session.save(fte);
		  System.out.println(se);
		  System.out.println(pte);
		  System.out.println(fte);
		  txn.commit();
		  
	}

}
