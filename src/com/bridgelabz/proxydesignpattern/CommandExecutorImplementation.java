package com.bridgelabz.proxydesignpattern;

import java.io.IOException;

public class CommandExecutorImplementation implements CommandExecutor {

	@Override
	public void runCommand(String command) throws IOException {
		Runtime.getRuntime().exec(command);
		System.out.println(command+"Command executor");
	}

}
