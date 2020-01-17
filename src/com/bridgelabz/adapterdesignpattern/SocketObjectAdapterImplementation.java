package com.bridgelabz.adapterdesignpattern;

public class SocketObjectAdapterImplementation  implements SocketAdapter {

	Socket socket	=	new Socket();
	@Override
	public Volt get120Volt() {
		
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v	=	socket.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v	=	socket.getVolt();
		return convertVolt(v, 40);
	}
	private Volt convertVolt(Volt volt,int i) {
		
		return new Volt(volt.getVolt()/i);
		
	}

}
