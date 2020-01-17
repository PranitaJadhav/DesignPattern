package com.bridgelabz.singletonedesignpattern;

public class ThreadSafeSingleToneWithDoubleCheckedLockingTest {
  public static void main(String[] args) {
	ThreadSafeSingleToneWithDoubleCheckedLocking.getInstance().show();
	System.out.println(ThreadSafeSingleToneWithDoubleCheckedLocking.getInstance().hashCode());
  }
}
final class ThreadSafeSingleToneWithDoubleCheckedLocking{
	private static ThreadSafeSingleToneWithDoubleCheckedLocking	instance	=	null;
	private ThreadSafeSingleToneWithDoubleCheckedLocking() {}
	public static ThreadSafeSingleToneWithDoubleCheckedLocking getInstance() {
		if( instance == null) {
			synchronized (ThreadSafeSingleToneWithDoubleCheckedLocking.class) {
				if(instance == null) {
					instance	=	new ThreadSafeSingleToneWithDoubleCheckedLocking();
				}
			}
		}
		return instance;
	}
	public void show() {
		System.out.println("my ThreadSafe SingleTone With DoubleChecked Locking");
	}
}