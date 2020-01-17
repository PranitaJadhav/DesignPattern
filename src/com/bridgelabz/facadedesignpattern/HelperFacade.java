package com.bridgelabz.facadedesignpattern;

import java.sql.Connection;

public class HelperFacade {
	public static void generateReport(DBTypes dbtype, ReportTypes reporttype, String tablename) {
		Connection con	=	null;
		switch(dbtype) {
		 case MYSQL:
				con	=	MySql.getMySqlConnection();
				MySql mysql	=	new MySql();
				switch(reporttype) {
				case HTML: mysql.generateMyHtmlReport(tablename, con);
						   break;
				case PDF: mysql.generatePDFReport(tablename, con);
						  break;
				}
			break;
			
		 case ORACLE:
			 con	=	Oracle.getOracleConnection();
			 Oracle oracle	=	new Oracle();
			 switch(reporttype) {
			 case HTML: oracle.generateMyHtmlReport(tablename, con);
			 			break;
			 case PDF:oracle.generatePDFReport(tablename, con);
			 			break;
			 }
			 break;
		}
	}
	public static enum DBTypes{
		MYSQL,ORACLE
	}
	public static enum ReportTypes{
		HTML,PDF
	}
}
