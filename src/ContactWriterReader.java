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
		Contacts [] myContacts;
		myContacts = new Contacts[25];
		int numContacts = 0;
		Scanner keyboard = new Scanner( System.in );
		String info;
		String input;
		PrintWriter write;
		BufferedReader reader;
		
		/*
		 * File myFile = new File( "my_contacts.txt" );
		 * Contact [] myContacts;
		 * myContacts = new Contact[25];
		 * int numContacts = 0; tells where we are in the array
		 * Scanner keyboard = new Scanner( System.in );
		 * String input;
		 * PrintWriter writer;
		 * BufferedReader reader;
		 */
		
		if( contacts.exists() ) {
			
			reader = new BufferedReader( new FileReader(contacts) );
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
			
			reader.close();
				for( int ctr = 0; ctr < numContacts; ctr++ ) {
					//printing out still
				}
			}
			
		} else {
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
			} while (input.equalsIgnoreCase("y"));
			
		}
		
		/*
		 * for( int ctr = 0; ctr < numContacts; ctr++ ) {
		 * System.out.print( "Last name: " +myContacts[ctr].getLastName() );
		 * System.out.print( "First name: " + myContacts[ctr].getFirstName() );
		 * System.out.printf( "%s %s\n" , myContacts[ctr].getFirstName() , myContcacts[ctr].getLastName() );
		 * System.out.print( "-----" ); 
		 * }
		 * 
		 * } else {
		 * if the file does not exist, create an array of ocntact objects and then write them to disk and exit the program
		 * 
		 * asking for input from keyboard for contact
		 * do {
		 * 	myContacts[numContacts] = new Contacts...create new contact object in array
		 * 	System.out.print( "Last name: " );
		 * 	input = keyboard.nextLine();
		 * 	myContacts[numContacts].setFirstName(input);
		 *  ....
		 *  at the end..
		 *  System.out.print( "Do you want to enter another (y/n)? " );
		 *  input = keyboard.nextLine().toLowerCase();
		 *  
		 *  increment counter
		 *  numCounter++;
		 * } while( input.equals("y));
		 * 
		 * writer = new PrintWriter(myFile);
		 * loop through array and print
		 * for( int ctr = 0; ctr < numContacts; ctr++ ) {
		 * 		writer.println( myContacts[ctr].getLastName() );
		 * 		writer.println( myCOntacts[ctr].getFirstName() );
		 * 
		 * close the file
		 * writer.close();
		 */
		
	}

}
