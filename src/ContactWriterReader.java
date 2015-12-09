import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
		Scanner keyboard = new Scanner( System.in );
		String newName;
		
		while( !contacts.exists() ) {
        	System.out.print( contacts.getName() + " DOES NOT exist. New name: " );
            newName = keyboard.nextLine();
            contacts = new File( newName );
        }
		
		while( contacts.exists() ) {
			
		}
		
		/*
		 * first time through start loop...asks user for information..like loop already in contact class
		 * another loop that goes through and writes each individual piece of information to disk
		 * 
		 * second time through..read back with header
		 */
	}

}
