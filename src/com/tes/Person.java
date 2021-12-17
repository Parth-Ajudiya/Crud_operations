package com.tes;

class Person
{
	protected int personID;
	protected String personName;
	protected String personContact;
	protected String personMail;
	protected String personAddress;
	
	public Person(int persionID, String personName, String persionContact, String personMail, String personAddress) {
		super();
		this.personID = persionID;
		this.personName = personName;
		this.personContact = persionContact;
		this.personMail = personMail;
		this.personAddress = personAddress;
	}

	public int getPersionID() {
		return personID;
	}

	public String getPersonName() {
		return personName;
	}

	public String getPersionContact() {
		return personContact;
	}

	public String getPersonMail() {
		return personMail;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	@Override
	public String toString() {
		return " " + personID + " : " + personName + " : " + personContact
				+ " : " + personMail + " : " + personAddress + " ";
	}		
}