import java.io.*;
import java.util.Scanner;

/**
 * 
 * @author Julianna Nichols
 */
public class ContactWriterReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		File contacts = new File( "myContacts.txt" );
		PrintWriter write = new PrintWriter(contacts); //PrintWriter used to write to file
		Scanner keyboard = new Scanner( System.in ); //Scanner object
		Contacts [] myContacts = new Contacts[25];
		BufferedReader reader = new BufferedReader( new FileReader(contacts) );;
		String input;
		int numContacts = 0;
		
		if( contacts.exists() ) {
			
			while( reader.ready() ) {
			myContacts [numContacts] = new Contacts();
			input = reader.readLine();
			myContacts[numContacts].setLastName( input );
			input = reader.readLine();
			myContacts[numContacts].setFirstName( input );
			input = reader.readLine();
			myContacts[numContacts].setMiddleName( input );
			input = reader.readLine();
			myContacts[numContacts].setPrefix( input );
			input = reader.readLine();
			myContacts[numContacts].setPhoneNumber( input );
			input = reader.readLine();
			myContacts[numContacts].setEmail( input );
			input = reader.readLine();
			myContacts[numContacts].setStreet( input );
			input = reader.readLine();
			myContacts[numContacts].setCity( input );
			input = reader.readLine();
			myContacts[numContacts].setState( input );
			input = reader.readLine();
			myContacts[numContacts].setZip( input );
			input = reader.readLine();
			myContacts[numContacts].setOccupation( input );
			input = reader.readLine();
			
			numContacts++;
			
			reader.close(); //reader needs to be closed
			
				for( int ctr = 0; ctr < numContacts; ctr++ ) {
					int contNum = 1;
					System.out.print( "Contact number " + contNum + ":\nName: "
							+ myContacts[ctr].getPrefix() + " " + myContacts[ctr].getFirstName() + " "
							+ myContacts[ctr].getMiddleName() + " " + myContacts[ctr].getLastName()
							+ "\nPhone Number: " + myContacts[ctr].getPhoneNumber() + "\nE-mail: "
							+ myContacts[ctr].getEmail() + "\nAddress: " + myContacts[ctr].getStreet()
							+ "\n" + myContacts[ctr].getCity() + ", " + myContacts[ctr].getState() + " "
							+ myContacts[ctr].getZip() + myContacts[ctr].getOccupation() );
				}
			}
			
		} else {
			
			//getting all the contact information
			do {
				myContacts[numContacts] = new Contacts();
				
				//last name
		        System.out.print( "Enter last name: " );
		        input = keyboard.nextLine();
		        myContacts[numContacts].setLastName( input );
		        //first name
		        System.out.print( "Enter first name: " );
		        input = keyboard.nextLine();
		        myContacts[numContacts].setFirstName( input );
		        //middle name
		        System.out.print( "Enter middle name: " );
		        input = keyboard.nextLine();
		        myContacts[numContacts].setMiddleName( input );
		        //prefix
		        System.out.print( "Enter prefix: " );
		        input = keyboard.nextLine();
		        myContacts[numContacts].setPrefix( input );
		        //phone number
		        System.out.print( "Enter phone number (### - ### - ####): " );
		        input = keyboard.nextLine();
		        myContacts[numContacts].setPhoneNumber( input );
		        //e-mail address
		        System.out.print( "Enter e-mail: " );
		        input = keyboard.nextLine();
		        myContacts[numContacts].setEmail( input );
		        //street name
		        System.out.print( "Enter street name: " );
		        input = keyboard.nextLine();
		        myContacts[numContacts].setStreet( input );
		        //city name
		        System.out.print( "Enter city name: " );
		        input = keyboard.nextLine();
		        myContacts[numContacts].setCity( input );
		        //state name
		        System.out.print( "Enter state name: " );
		        input = keyboard.nextLine();
		        myContacts[numContacts].setState( input );
		        //zip code
		        System.out.print( "Enter zip code: " );
		        input = keyboard.nextLine();
		        myContacts[numContacts].setZip( input );
		        //occupation
		        System.out.print( "Enter occupation: " );
		        input = keyboard.nextLine();
		        myContacts[numContacts].setOccupation( input );
		        
		        System.out.print( "Do you want to enter another contact? (Y/N): ");
		        input = keyboard.nextLine();
		        numContacts++;
		        
			} while (input.equalsIgnoreCase("y"));
			
		}
		
		//writing information to file
		for (int ctr = 0; ctr < numContacts; ctr++ ) {
			write.println( myContacts[ctr].getFirstName() );
			write.println( myContacts[ctr].getMiddleName() );
			write.println( myContacts[ctr].getLastName() );
			write.println( myContacts[ctr].getPrefix() );
			write.println( myContacts[ctr].getPhoneNumber() );
			write.println( myContacts[ctr].getEmail() );
			write.println( myContacts[ctr].getStreet() );
			write.println( myContacts[ctr].getCity() );
			write.println( myContacts[ctr].getState() );
			write.println( myContacts[ctr].getZip() );
			write.println( myContacts[ctr].getOccupation() );
		}
		
		write.close(); //close PrintWriter	
	}

}
