/**
 * 
 */
package edu.cvtc.java;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Ssawle
 *
 */
public class CustomerContact extends JFrame {

	private static final long serialVersionUID = -793227377217133730L;
	
	private JTextField firstName = new JTextField(10);
	private JTextField lastName = new JTextField(10);
	private JTextField birthDate = new JTextField(10);
	private JTextField emailAddress = new JTextField(10);
	private JTextField phoneNumber = new JTextField(10);
	
	private static final JLabel FIRST_NAME_LABEL = new JLabel("First Name: ");
	private static final JLabel LAST_NAME_LABEL = new JLabel("Last Name: ");
	private static final JLabel BIRTH_DATE_LABEL = new JLabel("Birth Date: ");
	private static final JLabel EMAIL_ADDRESS_LABEL = new JLabel("Email Address: ");
	private static final JLabel PHONE_NUMBER_LABEL = new JLabel("Phone Number: ");
	
	private JPanel firstNamePanel = new JPanel();
	private JPanel lastNamePanel = new JPanel();
	private JPanel birthDatePanel = new JPanel();
	private JPanel emailAddressPanel = new JPanel();
	private JPanel phoneNumberPanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	
	private JButton addCustomer = new JButton("Add Customer");
	
	public CustomerContact() {
		super("Customer Contact");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(6, 1));
		
		firstNamePanel.add(FIRST_NAME_LABEL);
		firstNamePanel.add(firstName);
		
		lastNamePanel.add(LAST_NAME_LABEL);
		lastNamePanel.add(lastName);
		
		birthDatePanel.add(BIRTH_DATE_LABEL);
		birthDatePanel.add(birthDate);
		
		emailAddressPanel.add(EMAIL_ADDRESS_LABEL);
		emailAddressPanel.add(emailAddress);
		
		phoneNumberPanel.add(PHONE_NUMBER_LABEL);
		phoneNumberPanel.add(phoneNumber);
		
		addCustomer.addActionListener(new AddCustomerActionListener());
		
		buttonPanel.add(addCustomer);
			
		add(firstNamePanel);
		add(lastNamePanel);
		add(birthDatePanel);
		add(emailAddressPanel);
		add(phoneNumberPanel);
		add(buttonPanel);
		
		pack();
		
		setVisible(true);
	}
	
	private class AddCustomerActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Contact contact = new Contact(firstName.getText(), lastName.getText(), birthDate.getText(), emailAddress.getText(), phoneNumber.getText());
			System.out.println(contact.toString());
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new CustomerContact();

	}
}
