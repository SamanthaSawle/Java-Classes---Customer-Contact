/**
 * 
 */
package edu.cvtc.java;

/**
 * @author Ssawle
 *
 */
public class Contact extends Person {

	public String emailAddress;
	public String phoneNumber;
	
	public Contact(String firstName, String lastName, String birthDate, String emailAddress, String phoneNumber) {
		super(firstName, lastName, birthDate);
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return "Contact [emailAddress=" + emailAddress + ", phoneNumber="
				+ phoneNumber + " " + super.toString() + "]";
	}
}
