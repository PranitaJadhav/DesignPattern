package com.bridgelabz.prototypedesignpattern;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		Employee employee	=	new Employee();
		employee.loadList();
		
		Employee employee2	=	(Employee) employee.clone();
		Employee employee3	=	(Employee) employee.clone();
		List<String> list	=	employee2.getEmp();
		list.add("Varad");
		List<String> list1	=	employee3.getEmp();
		list1.add("Shraddha");
		System.out.println("Employee list"+employee.getEmp());
		System.out.println("Employee list1"+list);
		System.out.println("Employee list2"+list1);
	}

}
