package com.bridgelabz.facadedesignpattern;

import java.sql.Connection;

public class MySql {
	public static Connection getMySqlConnection() {
		return null;
	}
	public void generateMyHtmlReport(String tablename,Connection con) {
		System.out.println("Here is my html report generated from mysql");
	}
	public void generatePDFReport(String tablename,Connection con) {
		System.out.println("Here is my pdf report generated from mysql report");
	}
}
	