/**
 * 
 */
package com.bridgelabz.factorypattern;

/**
 * extend abstract computer class
 */
public class Pc extends Computer{
	private String RAM;
	private String HD;
	private String CPU;
	
	public Pc(String RAM,String HD,String CPU) {
		this.RAM	=	RAM;
		this.HD		=	HD;
		this.CPU	=	CPU;
	}
	@Override
	public String getRAM() {
		return this.RAM;
	}
	@Override
	public String getHD() {
		return this.HD;
	}
	@Override
	public String getCPU() {
		return this.CPU;
	}
	
}
