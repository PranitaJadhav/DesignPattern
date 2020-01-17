package com.bridgelabz.proxydesignpattern;

public class ProxyDesignPatternTest {

	public static void main(String[] args) {
		CommandExecutor executor	=	new CommandExecutorProxy("Pranita", "Pranita@11");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf abc.pdf");
		}
		catch(Exception e) {
			System.out.println("Exception message"+e.getMessage());
		}
	}

}
