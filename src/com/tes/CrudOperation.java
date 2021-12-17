package com.tes;

import java.util.*;

public class CrudOperation extends ArrayListOfElements
{
	public CrudOperation(List<Person> p) {
		super(p);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{

		Info f = new Info();
		SearchElements sa = new SearchElements(p);
		
		
		int ch;
		Scanner s = new Scanner(System.in);
		
	// For auto generation Person ID
		int id = 1;
		int ids = 0;
		
	// Looping for main menu
		do
		{	System.out.println(" ********** PERSON DETAILS ********** ");
			System.out.println();
			System.out.println("1. Add Person");
			System.out.println("2. Display Person");
			System.out.println("3. Search Person");
			System.out.println("4. Delete Person");
			System.out.println("5. Update Person");
			System.out.println("0. Closed ");
			System.out.println("------------------------");
			System.out.println();
			System.out.print("Enter your choice :");
			System.out.println();
			ch = s.nextInt();
			switch(ch)
			{
			
			// *** For adding values ***	
				case 1:
					System.out.println("Enetr your Name : ");
					String n1 = f.addName();
					System.out.println("Enetr your Contact : ");
					String c1 = f.addContact();
					System.out.println("Enetr your Email : ");
					String e1 = f.addEmail();
					System.out.println("Enetr your Address : ");
					String a1 = f.addAddress();
								p.add(new Person(id,n1,c1,e1,a1));
								id++;		
					break;
					
			// *** For display the values ***
				case 2:
					Iterator<Person> i = p.iterator();
					System.out.println("------------------------");
	
					while(i.hasNext())
					{						
						Person p1 = i.next();
						System.out.println(p1);			
					}
					System.out.println("------------------------");
					break;
					
			// *** For searching values ***	
				case 3:
					sa.search();
					break;
			// *** For delete the values ***	
				
				case 4:	
				{
				try
				{
					i = p.iterator();
					System.out.println("Enter id for Delete ..");
					
					
					{
						System.out.println("------------------------");
						while(i.hasNext())
						{
							
							Person p1 = i.next();
							do
							{
								ids = s.nextInt();
								System.out.println("Wrong id entered  !");
								System.out.println();
								System.out.println("press \"0\" to Exit or Re-enter ID : ");
							}while(p1.getPersionID() != ids && ids!=0);
							if(ids !=0)
							i.remove();
							System.out.println("Delete successfully !");
						
						}
						System.out.println("------------------------");
					}
				}catch(Exception e) 
				{
					System.out.println("Enter valid Number !");
					break;
				}		
				}
				break;
					
			// *** For Update the values ***
					
				case 5:
				{
					ListIterator<Person> li = p.listIterator();
					System.out.println("Enter id for Update : ");
					ids = s.nextInt();
					System.out.println("------------------------");
					@SuppressWarnings("unused")
					boolean r=false;
					while(li.hasNext())
					{
						System.out.println("Enetr new your Name : ");
						 n1 = f.addName();
						 System.out.println("Enetr new your Contact : ");
						 c1 = f.addContact();
						 System.out.println("Enetr new your Email : ");
						 e1 = f.addEmail();
						 System.out.println("Enetr new your Address : ");
						 a1 = f.addAddress();
						
						Person p1 = li.next();
						if(ids == p1.personID)
						{
							li.set(new Person(ids,n1,c1,e1,a1));
						}
						else 
						{
							System.out.println("Wrong id enterd");
							
						}
					}
				}
				System.out.println();
				break;
			
			}
		}while(ch!=0  && ch<6);
		System.out.println("\n* The app is closed *");		
	}
}
