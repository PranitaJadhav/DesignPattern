package com.bridgelabz.proxydesignpattern;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor{	
	private boolean isAdmin;
	private CommandExecutor executor;
	public CommandExecutorProxy(String user,String password) {
		if("Pranita".equals(user) && "Pranita@11".equals(password)) {
			executor	=	new CommandExecutorImplementation();
		}
	}
	@Override
	public void runCommand(String command) throws Exception {
		if(isAdmin) {
			executor.runCommand(command);
		}
		else{
			if(command.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.runCommand(command);
			}
	}
	}
}
