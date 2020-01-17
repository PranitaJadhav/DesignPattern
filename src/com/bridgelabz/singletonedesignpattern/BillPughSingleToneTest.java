package com.bridgelabz.singletonedesignpattern;

public class BillPughSingleToneTest {
	public static void main(String[] args) {
		BillPughSingleTone.getInstance().show();
		System.out.println(BillPughSingleTone.getInstance().hashCode());
	}
}
final class BillPughSingleTone{
	private BillPughSingleTone() {}
	private static class BillPughSingleToneHelper{
		private static final BillPughSingleTone instance =	new BillPughSingleTone();	
	}
	public static BillPughSingleTone getInstance() {
		return BillPughSingleToneHelper.instance;
		}
	public void show() {
		System.out.println("my Bill Pugh SingleTone");
	}
}