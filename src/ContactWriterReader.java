import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author Julianna Nichols
 */
public class ContactWriterReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File contacts = new File( "myContacts.txt" );
		Scanner keyboard = new Scanner( System.in );
		
		while( !contacts.exists() ) {
        	System.out.print( contacts.getName() + " DOES NOT exist. New name: " );
            inputString = keyboard.nextLine();
            myFile = new File( inputString );
        }
		
		/*
		 * first time through start loop...asks user for information..like loop already in contact class
		 * another loop that goes through and writes each individual piece of information to disk
		 * 
		 * second time through..read back with header
		 */
	}

}
