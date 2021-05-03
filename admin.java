/*
*
*   @Author Eyad Mostafa
*
*/
public class Admin extends User {
    public Admin(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
        
    }

    /*
    * Functions for admin to manage their accounts (change username, password, first name and last name)
    */

    public void changeAdminPassword(String password) {
        setPassword(password);
    }
    public void changeAdminUsername(String username) {
        setUsername(username);
    }
    public void changeFirstName(String firstName) {
        setFirstName(firstName);
    }
    public void changeLastName(String lastName) {
        setLastName(lastName);
    }
    
    /*
    Add remove and update train functions will go here
    */
    
    /*
    Generate Report function goes here
    */


}

