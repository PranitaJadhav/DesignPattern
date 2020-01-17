package com.bridgelabz.adapterdesignpattern;

public class SocketClassAdapterImplClassAdapter extends Socket implements SocketAdapter {
	
	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v	=	getVolt();
		return  convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v	=	getVolt();
		return  convertVolt(v, 40);
		
	}
	
	private Volt convertVolt(Volt volt,int i) {
		
		return new Volt(volt.getVolt()/i);
		
	}
}
