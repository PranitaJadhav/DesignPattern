package com.bridgelabz.singletonedesignpattern;

public class ThreadSafeSingleToneTest {
	public static void main(String[] args) {
	ThreadSafeSingleTone.getInstance().show();
	System.out.println(ThreadSafeSingleTone.getInstance().hashCode());
	}
}
final class ThreadSafeSingleTone{
	private static volatile ThreadSafeSingleTone instance	=	new ThreadSafeSingleTone();
	private ThreadSafeSingleTone() {}
	public static synchronized ThreadSafeSingleTone getInstance() {
		if(instance == null) {
			instance	=	new ThreadSafeSingleTone();
		}
		return instance;
	}
	public void show() {
		System.out.println("My ThreadSafe SingleTone");
		
	}
}