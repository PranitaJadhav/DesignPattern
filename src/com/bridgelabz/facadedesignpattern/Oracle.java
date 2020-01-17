package com.bridgelabz.facadedesignpattern;

import java.sql.Connection;

public class Oracle {
	public static Connection getOracleConnection() {
		return null;
	}
	public void generateMyHtmlReport(String tablename,Connection con) {
		System.out.println("Here is my html report generated from oracle");
	}
	public void generatePDFReport(String tablename,Connection con) {
		System.out.println("Here is my html report generated from oracle");
	}
}
