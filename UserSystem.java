/*
** @Author Eyad Mostafa
**/


//Needs to import user class here

import java.util.ArrayList;
public class UserSystem {
    private ArrayList<User> users = new ArrayList<User>(); 
    
    public UserSystem() {
        users.clear();
    }
    public void createAccount(String type, String username, String password, String fname, String lname) {
        if(type == "admin" || type == "Admin") {
            Admin adminUser = new Admin(username, password, fname, lname);
            adminUser.setType("Admin");
            users.add(adminUser);
            System.out.println("Admin user has been created successfully");
        }
        else if(type == "passenger" || type == "Passenger") {
            Passenger passengerUser = new Passenger(username, password, fname, lname);
            passengerUser.setType("Passenger");
            users.add(passengerUser);
            System.out.println("Passenger user has been created successfully");
        }
    }

    //Login returns user of instance matching username and password

    public User Login(String username, String password) {
        User index = new User();
        //creating user object
        for(int i = 0; i < users.size(); i++) {
            index = users.get(i);
            // Check username
            if (index.getUsername() == username) {
                if(index.getPassword() != password) {
                    System.out.println("Wrong password");
                }
                else if(index.getPassword() == password) {
                    System.out.println("Login successful");
                    return index;
                }                
            }
        }
        return index; 
    }

    /*
    * userOptions Function for user to see what he can do after logging in will go here
    */

}
