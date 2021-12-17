package com.tes;

import java.util.*;

public class SearchElements extends ArrayListOfElements
{
	boolean ar = false;
	public SearchElements(List<Person> p)
	{
		super(p);
	}
	Scanner ss2 = new Scanner(System.in);
	public void search()
	{	
		Iterator<Person> itr2 = p.iterator();
		System.out.print("Enter Elements for Search : ");
		String userInput = ss2.nextLine();
		System.out.println();		
		while(itr2.hasNext())
		{	
			Person ip = (Person) itr2.next();
			String str2 = String.valueOf(ip.getPersionID()); 
				
			if(ip.getPersonName().contains(userInput) || ip.getPersionContact().contains(userInput) || ip.getPersonMail().contains(userInput) || ip.getPersonAddress().contains(userInput) || str2.contains(userInput))
			{	
				System.out.println(ip);
				ar = true;
			}
		}
		System.out.println();	
		if(ar == false)
		{
			System.out.println("Enetr valid Input");
			System.out.println();	
		}
	}
}
