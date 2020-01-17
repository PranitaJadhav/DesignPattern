package com.bridgelabz.singletonedesignpattern;

/**
 * @author Pranita Jadhav
 * @Date- 15/01/2020
 *
 */
public class StaticBlockInitializationTest {
	public static void main(String[] args) {
		StaticBlockInitialization.getInstance().show();
		System.out.println(StaticBlockInitialization.getInstance().hashCode());
	}
}
final class StaticBlockInitialization{
	private static StaticBlockInitialization instance	=	null;
	private StaticBlockInitialization() {}
	static {
		try {
			if(instance == null) {
				instance	=	new StaticBlockInitialization();
			}
		}
		catch(Exception e) {
			throw new RuntimeException("Error occured");
		}
	}
	public static StaticBlockInitialization getInstance() {
		return instance;
		
	}
	public void show() {
		System.out.println("My Static Block Initialization");
	}
}