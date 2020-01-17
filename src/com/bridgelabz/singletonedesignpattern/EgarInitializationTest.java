package com.bridgelabz.singletonedesignpattern;
/**
 * @author Pranita Jadhav
 * @Date- 15/01/2020
 *
 */
public class EgarInitializationTest{
	public static void main(String[] args) {
		
		EgarInitialization.getInstance().show();
		System.out.println(EgarInitialization.getInstance().hashCode());
		}
}
  final class EgarInitialization{
		private final static EgarInitialization instance	=	new EgarInitialization();
		private EgarInitialization() {}
		
		public static EgarInitialization getInstance() {
			return instance;
		}
		
		public void show() {
			System.out.println("My EgarInitialization");
		}
		
	}

