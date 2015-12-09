import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Julianna Nichols
 */
public class ContactTest {
	
	public static void inputInformation() throws IOException {
	
	//File contacts = new File( "myContacts.txt" );
	//PrintWriter outputFile = new PrintWriter( contacts );
	String [] contactArray = new String[25];
	Scanner keyboard = new Scanner( System.in );
	
	Contact testContact = new Contact();
    String input = null;
    
    //user enters contact's last name
    System.out.print( "Enter last name: " );
    input = keyboard.nextLine();
    contactArray.println(input);
    
    //user enters contact's first name
    System.out.print( "Enter first name: " );
    input = keyboard.nextLine();
    testContact.setFirstName( input );
    
    //user enters contact's middle name
    System.out.print( "Enter middle name: " );
    input = keyboard.nextLine();
    testContact.setMiddleName( input );
    
    //user enters contact's prefix
    System.out.print( "Enter prefix: " );
    input = keyboard.nextLine();
    testContact.setPrefix( input );
    
    //user enters contact's phone number
    System.out.print( "Enter phone number (### - ### - ####): " );
    input = keyboard.nextLine();
    testContact.setPhoneNumber( input );
    
    //user enters contact's e-mail address
    System.out.print( "Enter e-mail: " );
    input = keyboard.nextLine();
    testContact.setEmail( input );
    
    //user enters contact's street name
    System.out.print( "Enter street name: " );
    input = keyboard.nextLine();
    testContact.setStreet( input );
    
    //user enters contact's city name
    System.out.print( "Enter city name: " );
    input = keyboard.nextLine();
    testContact.setCity( input );
    
    //user enters contact's state name
    System.out.print( "Enter state name: " );
    input = keyboard.nextLine();
    testContact.setState( input );
    
    //user enters contact's zip code
    System.out.print( "Enter zip code: " );
    input = keyboard.nextLine();
    testContact.setZip( input );
    
    //user enters contact's occupation
    System.out.print( "Enter occupation: " );
    input = keyboard.nextLine();
    testContact.setOccupation( input );
    
	}
}

/**
 * This class sets and gets the information for the contact.
 * @author Julianna Nichols
 *
 */

public static class Contact {
    Contact() {
    }
    
    private String lName,fName, mName;
    private String prefix;
    private String phone;
    private String email;
    private String street, city, state, zip;
    private String occupation;
    
    /**
     * Sets last name
     * @param n
     */
    
    public void setLastName( String n ) {
    	//regex parameters: any number of capital/lower case letters, hyphen, or apostrophe 
        if( !n.matches( "^[A-Za-z-']+$" )) {
            System.out.println( "Invalid characters in last name!" );
        } else {
            lName = n;
        }
    }

    /**
     * Returns last name 
     * @return lName
     */
    
    public String getLastName() {
        return lName;
    }
    
    /**
     * Sets first name 
     * @param n
     */

    public void setFirstName( String n ) {
    	//regex parameters: any number of capital/lower case letters, hyphen, or apostrophe
    	if ( !n.matches( "^[A-Za-z-']+$" )) {
    		System.out.println( "Invalid characters in first name!" );
    	} else {
    		fName = n;
    	}
    }
    
    /**
     * Returns first name 
     * @return fName
     */
    
    public String getFirstName() {
        return fName;
    }
    
    /**
     * Sets middle name
     * @param n
     */
    
    public void setMiddleName( String n ) {
    	//regex parameters: any number of capital/lower case letters and spaces
    	if( !n.matches( "^[A-Za-z ]+$" )) {
    		System.out.println( "Invalid characters in middle name!" );
    	} else {
    		mName = n;
    	}
    }
    
    /**
     * Returns middle name
     * @return mName
     */
    
    public String getMiddleName() {
        return mName;
    }
    
    /**
     * Sets prefix
     * @param n
     */
    
    public void setPrefix( String n ) {
    	//regex parameters: any number of capital/lower case letters and period
    	if( !n.matches( "^[A-Za-z.]+$" )) {
    		System.out.println( "Invalid characters in prefix!" );
    	} else {
    		prefix = n;
    	}
    }
    
    /**
     * Returns prefix
     * @return prefix
     */
    
    public String getPrefix() {
    	return prefix;
    }
    
    /**
     * Sets phone number
     * @param n
     */
    
    public void setPhoneNumber( String n ) {
    	/*
    	 * Regex parameters: numbers 0-9 and hyphen
    	 * exactly 12 characters (###-###-####)
    	 */
        if( !n.matches( "^[0-9-]{12}$" )) {
            System.out.println( "Invalid characters in phone number!" );
        } else {
            phone = n;
        }
    }
    
    /**
     * Returns phone number 
     * @return phone
     */
    
    public String getPhoneNumber() {
        return phone;
    }
    
    /**
     * Sets e-mail
     * @param n
     */
    
    public void setEmail( String n ) {
    	//regex parameters: any number of capital/lower case letters, any number of numbers 0-9, period, and at sign
        if( !n.matches( "^[A-Za-z0-9.@]+$" )) {
            System.out.println( "Invalid characters in e-mail!" );
        } else {
            email = n;
        }
    }
    
    /**
     * Returns e-mail
     * @return email
     */
    
    public String getEmail() {
        return email;
    }
    
    /**
     * Sets street name (including house number and street name)
     * @param n
     */
    
    public void setStreet( String n ) {
        //regex parameters: any number of capital/lower case letters, any number of numbers 0-9, spaces, and periods
        if( !n.matches( "^[A-Za-z0-9. ]+$" )) {
            System.out.println( "Invalid characters in street name!" );
        } else {
            street = n;
        }
    }
    
    /**
     * Returns street name
     * @return street
     */
    
    public String getStreet() {
        return street;
    }
    
    /**
     * Sets city name
     * @param n
     */
    
    public void setCity( String n ) {
    	//regex parameters: any number of capital/lower case letters and spaces
    	if( !n.matches( "^[A-Za-z ]+$" )) {
    		System.out.println( "Invalid characters in city name!" );
    	} else {
    		city = n;
    	}
    }
    
    /**
     * Gets city name
     * @return city
     */
    
    public String getCity() {
    	return city;
    }
    
    /**
     * Sets state name
     * @param n
     */
    
    public void setState( String n ) {
    	//regex parameters: any number of capital/lower case letters
    	if( !n.matches( "^[A-Za-z]+$" )) {
    		System.out.println( "Invalid characters in state name!" );
    	} else {
    		state = n;
    	}
    }
    
    /**
     * Gets state name
     * @return state
     */
    
    public String getState() {
    	return state;
    }
    
    /**
     * Sets zip code
     * @param n
     */
    
    public void setZip( String n ) {
    	/*
    	 * regex parameters: numbers 0-9 and hyphen
    	 * exactly 10 characters (#####-####) OR exactly 5 characters (#####)
    	 */
    	if( !n.matches( "^[0-9-]{10}|[0-9]{5}$" )) {
    		System.out.println( "Invalid characters in zip code!" );
    	} else {
    		zip = n;
    	}
    }
    
    /**
     * Gets zip code
     * @return zip
     */
    
    public String getZip() {
    	return zip;
    }
    
    /**
     * Sets occupation name
     * @param n
     */
    
    public void setOccupation( String n ) {
    	//regex parameters: any number of capital/lower case letters and spaces
    	if( !n.matches( "^[A-Za-z ]+$" )) {
    		System.out.println( "Invalid characters in occupation name!" );
    	} else {
    		occupation = n;
    	}
    }
    
    /**
     * Gets occupation name
     * @return occupation
     */
    
    
    public String getOccupation() {
    	return occupation;
    }
}
