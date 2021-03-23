package emailapp;

import java.util.Scanner;

public class Email {

	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	// constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

		// call method asking for department and return department
		
		this.department = setDepartment();
		
		
		
	}
	
	
	
	
	// ask for department
	private String setDepartment() {
		System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none.");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "dev"; 
		} else if (depChoice == 3) {
			return "acct";
		} else {
			return ""; 
		}
	}
	// generate a random password
	
	// set the mailbox capacity
	
	// set the alternate email
	
	// change the password	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
