
public class Contacts {
	/**
     * This class sets and gets the information for the contact.
     * @author Julianna Nichols
     *
     */
    
    public static class Contact {
        Contact() {
        }
    }
    
    /**
     * Sets last name
     * @param n
     */
    
    public void setLastName( String input ) {
    	//regex parameters: any number of capital/lower case letters, hyphen, or apostrophe 
        if( !input.matches( "^[A-Za-z-']+$" )) {
            System.out.println( "Invalid characters in last name!" );
        } else {
            lName = input;
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

    public void setFirstName( String input ) {
    	//regex parameters: any number of capital/lower case letters, hyphen, or apostrophe
    	if ( !input.matches( "^[A-Za-z-']+$" )) {
    		System.out.println( "Invalid characters in first name!" );
    	} else {
    		fName = input;
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
    
    public void setMiddleName( String input ) {
    	//regex parameters: any number of capital/lower case letters and spaces
    	if( !input.matches( "^[A-Za-z ]+$" )) {
    		System.out.println( "Invalid characters in middle name!" );
    	} else {
    		mName = input;
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
    
    public void setPrefix( String input ) {
    	//regex parameters: any number of capital/lower case letters and period
    	if( !input.matches( "^[A-Za-z.]+$" )) {
    		System.out.println( "Invalid characters in prefix!" );
    	} else {
    		prefix = input;
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
    
    public void setPhoneNumber( String input ) {
    	/*
    	 * Regex parameters: numbers 0-9 and hyphen
    	 * exactly 12 characters (###-###-####)
    	 */
        if( !input.matches( "^[0-9-]{12}$" )) {
            System.out.println( "Invalid characters in phone number!" );
        } else {
            phone = input;
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
    
    public void setEmail( String input ) {
    	//regex parameters: any number of capital/lower case letters, any number of numbers 0-9, period, and at sign
        if( !input.matches( "^[A-Za-z0-9.@]+$" )) {
            System.out.println( "Invalid characters in e-mail!" );
        } else {
            email = input;
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
    
    public void setStreet( String input ) {
        //regex parameters: any number of capital/lower case letters, any number of numbers 0-9, spaces, and periods
        if( !input.matches( "^[A-Za-z0-9. ]+$" )) {
            System.out.println( "Invalid characters in street name!" );
        } else {
            street = input;
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
    
    public void setCity( String input ) {
    	//regex parameters: any number of capital/lower case letters and spaces
    	if( !input.matches( "^[A-Za-z ]+$" )) {
    		System.out.println( "Invalid characters in city name!" );
    	} else {
    		city = input;
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
    
    public void setState( String input ) {
    	//regex parameters: any number of capital/lower case letters
    	if( !input.matches( "^[A-Za-z]+$" )) {
    		System.out.println( "Invalid characters in state name!" );
    	} else {
    		state = input;
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
    
    public void setZip( String input ) {
    	/*
    	 * regex parameters: numbers 0-9 and hyphen
    	 * exactly 10 characters (#####-####) OR exactly 5 characters (#####)
    	 */
    	if( !input.matches( "^[0-9-]{10}|[0-9]{5}$" )) {
    		System.out.println( "Invalid characters in zip code!" );
    	} else {
    		zip = input;
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
    
    public void setOccupation( String input ) {
    	//regex parameters: any number of capital/lower case letters and spaces
    	if( !input.matches( "^[A-Za-z ]+$" )) {
    		System.out.println( "Invalid characters in occupation name!" );
    	} else {
    		occupation = input;
    	}
    }
    
    /**
     * Gets occupation name
     * @return occupation
     */
    
    
    public String getOccupation() {
    	return occupation;
    }
    
    private String lName,fName, mName;
    private String prefix;
    private String phone;
    private String email;
    private String street, city, state, zip;
    private String occupation;
}
