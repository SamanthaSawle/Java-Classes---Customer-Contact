/**
 * 
 */
package edu.cvtc.java;
/**
 * @author Ssawle
 *
 */
public class Person {

	public String firstName;
	public String lastName;
	public String birthDate;
	
	public Person(String firstName, String lastName, String birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}	
	
	public String getFirstName() {
		return firstName;
	}	
	
	public String getLastName() {
		return lastName;
	}	
	
	public String getBirthDate() {
		return birthDate;
	}
	
	public String toString() {
		return "Person [firstName = " + firstName + ", lastName = " + lastName
				+ ", birthDate = " + birthDate + "]";
	}	
}
