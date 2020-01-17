package com.bridgelabz.adapterdesignpattern;

public class AdapterPatternTest {

	public static void main(String[] args) {
		testObjectAdapter();
		testClassAdapter();

	}
	private static void testObjectAdapter() {
		SocketAdapter socketAdapter	=	new SocketObjectAdapterImplementation();
		Volt v3	=	getVolt(socketAdapter, 3);
		Volt v12	=	getVolt(socketAdapter, 12);
		Volt v120	=	getVolt(socketAdapter, 120);
		System.out.println("V3 volt using object adapter"+v3.getVolt());
		System.out.println("V3 volt using object adapter"+v12.getVolt());
		System.out.println("V3 volt using object adapter"+v120.getVolt());
				
	}
	 private static void testClassAdapter() {
		 SocketAdapter socketAdapter	=	new SocketClassAdapterImplClassAdapter();
		 Volt v3	=	getVolt(socketAdapter, 3);
		 Volt v12	=	getVolt(socketAdapter, 12);
		 Volt v120	=	getVolt(socketAdapter, 120);
		 System.out.println("V3 volt using class adapter"+v3.getVolt());
		 System.out.println("V3 volt using class adapter"+v12.getVolt());
		 System.out.println("V3 volt using class adapter"+v120.getVolt());
					
	 }
	private static Volt getVolt(SocketAdapter socketAdapter, int i) {
		switch(i) {
		case 3	: 	return socketAdapter.get3Volt();
		case 12	:	return socketAdapter.get12Volt();
		case 120: 	return socketAdapter.get120Volt();
		default	: 	return socketAdapter.get120Volt();
		}
	}

}
