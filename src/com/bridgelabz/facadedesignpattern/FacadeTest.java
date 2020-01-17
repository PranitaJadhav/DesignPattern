package com.bridgelabz.facadedesignpattern;

import java.sql.Connection;

public class FacadeTest {

	public static void main(String[] args) {
		String tablename	=	"employee";
		System.out.println("generation mysql html report and oracle pdf report without using facade");
		Connection con	=	MySql.getMySqlConnection();
		MySql mysql	=	new MySql();
		mysql.generateMyHtmlReport(tablename, con);
		
		Connection con1	=	Oracle.getOracleConnection();
		Oracle oracle	=	new Oracle();
		oracle.generatePDFReport(tablename, con1);
		System.out.println();
		System.out.println("generation mysql html report and oracle pdf report with using facad");
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL,HelperFacade.ReportTypes.HTML,tablename);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE,HelperFacade.ReportTypes.PDF,tablename);
	}

}
