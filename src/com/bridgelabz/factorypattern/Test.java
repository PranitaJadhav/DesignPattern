package com.bridgelabz.factorypattern;

public class Test {

	public static void main(String[] args) {
		Computer Pc		=	ComputerFactory.getComputer("Pc","2GB","100GB","2GHz");
		Computer server	= 	ComputerFactory.getComputer("Server","16GB","2TB","3GHz");	
		System.out.println("PC Configuration        -    "+Pc);
		System.out.println("Server Configuration    -    "+server);
		
	}

}
