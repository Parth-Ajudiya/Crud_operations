package com.tes;

import java.util.Scanner;

public class Info
{

	String rx = "^[0-9]{10}$";
	String emailRegex = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$";
	Scanner s = new Scanner(System.in);
		
	public String addContact()
		{
			String contact;
			do
			{
				contact = s.nextLine();
				if(!contact.matches(rx))
					System.out.print("Wrong Contact enterd please retype Contact :");
				
			}while(!contact.matches(rx));
			return contact;
	}
	
	public String addName()
	{
		String name;
		do
		{
			name = s.nextLine();
			if(name.length() > 20 )
				System.out.print("Name is too long, please retype Name :");
			
		}while(name.length()>20);
		return name;
	}
		
	public String addEmail()
	{
		String email;
		do
		{
			email = s.nextLine();
			if(!email.matches(emailRegex))
				System.out.print("Wrong Email enterd please retype Email :");
			
		}while(!email.matches(emailRegex));
		return email;
	}
	
	public String addAddress()
	{
		String address;
		do
		{
			address = s.nextLine();
			if(address.length() > 120 )
				System.out.print("Address is too long, please retype Address :");
			
		}while(address.length()>120);
		return address;
	}
}
