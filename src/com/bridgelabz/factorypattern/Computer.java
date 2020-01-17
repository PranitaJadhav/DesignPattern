package com.bridgelabz.factorypattern;

public abstract class Computer {
	public abstract String getRAM();
	public abstract String getHD();
	public abstract String getCPU();
	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getHD()=" + getHD() + ", getCPU()=" + getCPU() + "]";
	}

}
