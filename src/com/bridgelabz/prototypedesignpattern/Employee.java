package com.bridgelabz.prototypedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable  {
	private List<String> empList;
	public Employee() {
		empList	=	new ArrayList<String>();
	}
	public Employee(List<String> list) {
		this.empList	=	list;
	}
	public void loadList() {
		empList.add("Pranita");
		empList.add("Piyush");
		empList.add("Hanumant");
		empList.add("Sampada");
	}
	public List<String> getEmp(){
		return empList;
	}
	public Object clone() {
		List<String> temp	=	new ArrayList<String>();
		for(String s:this.getEmp()) {
			temp.add(s);
		}
		return new Employee(temp);
		
	}
}
