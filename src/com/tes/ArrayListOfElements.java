package com.tes;

import java.util.ArrayList;
import java.util.List;

class ArrayListOfElements 
{
	protected static List<Person> p = new ArrayList<Person>();
	

	public ArrayListOfElements(List<Person> p) {
		super();
		ArrayListOfElements.p = p;
		
	}


	public List<Person> getP() {
		return p;
	}


	public void setP(List<Person> p)
	{
		ArrayListOfElements.p = p;
	}
}