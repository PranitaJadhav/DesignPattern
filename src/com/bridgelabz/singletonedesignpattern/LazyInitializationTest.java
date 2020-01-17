package com.bridgelabz.singletonedesignpattern;
/**
 * @author Pranita Jadhav
 * @Date- 15/01/2020
 *
 */

public class LazyInitializationTest {

	public static void main(String[] args) {
	 LazyInitialization.getInstance().show();
	 System.out.println(LazyInitialization.getInstance().hashCode());
	}

}
/**
 * Purpose - To implement Lazy Initialization 
 */
final class LazyInitialization{
	//volatile makes every thread read the data from memory not read from thread catch
	private static volatile LazyInitialization instance	=	null;
	private LazyInitialization() {}
	public static LazyInitialization getInstance() {
		if(instance == null) {
			instance	=	new LazyInitialization();
		}
	return instance;
	}
	public void show() {
		System.out.println("My Lazy initialization");
	}
}