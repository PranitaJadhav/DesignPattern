/**
 * 
 */
package com.bridgelabz.factorypattern;

/**
 * @author admin1
 *
 */
public class ComputerFactory {
	public static Computer getComputer(String type,String RAM,String HDD,String CPU) {
		if("Pc".equalsIgnoreCase(type)) {
			return new Pc(RAM,HDD,CPU);
		}
		else if("Server".equalsIgnoreCase(type)) {
			return new Server(RAM,HDD,CPU);
		}
		return null;
	}
}
