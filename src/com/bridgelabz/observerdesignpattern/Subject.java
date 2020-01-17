package com.bridgelabz.observerdesignpattern;

public interface Subject {
	//method to register and deregister observer pattern
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	//method to notify observer to change
	public void notifyObservers();
	
	//method to get updates from subject
	public Object getUpdate(Observer obj);
}
