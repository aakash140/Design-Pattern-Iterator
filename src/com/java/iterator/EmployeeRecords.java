package com.java.iterator;


public class EmployeeRecords implements Container {
	String names[]={"Aakash","Vikas","Rahul","Naman","Shriyansh"};
	
	@Override
	public Iterator getIterator() {
		return new EmployeeIterator();
	}
	
	private class EmployeeIterator implements Iterator{
		int index=0;
		public boolean hasNext(){
			if(index<names.length)
				return true;
			else
				return false;
		}
		
		public String next(){
			if(hasNext())
				return names[index++];
			else
				return null;
		}
	}
}
