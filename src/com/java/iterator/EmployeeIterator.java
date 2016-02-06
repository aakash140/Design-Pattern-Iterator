package com.java.iterator;

public class EmployeeIterator {

	public static void main(String[] args) {
		EmployeeRecords employeeRecords=new EmployeeRecords();
		Iterator iterator=employeeRecords.getIterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}