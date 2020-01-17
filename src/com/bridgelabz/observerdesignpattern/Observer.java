package com.bridgelabz.observerdesignpattern;

public interface Observer {
	//method to update the observer , useb by subject
	public void update();
	//attach with subject to observer
	public void setSubject(Subject sub);
}
