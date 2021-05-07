/*
** @Author Eyad Mostafa
**/


//Needs to import user class here

import java.util.ArrayList;
import java.util.Scanner;
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

    public void adminOptions(Admin adminUser) {
        int option = 0;
        System.out.println("Please select one of the following options or enter -1 to exit");
        System.out.println("1- Change Admin Username");
        System.out.println("2- Change Admin Password");
        System.out.println("3- Change Admin Firstname");
        System.out.println("4- Change Admin Lastname");
        System.out.println("5- Add Train");
        System.out.println("6- Remove Train");
        System.out.println("7- Update Train");
        System.out.println("8- Generate Report");
        Scanner input = new Scanner(System.in);
        while(option != -1) {
            switch(option) {
                case 1:
                String username;
                System.out.println("Please enter new username");
                username = input.nextLine();
                adminUser.changeAdminUsername(username);
                break;
                case 2:
                String password;
                System.out.println("Please enter new password");
                password = input.nextLine();
                adminUser.changeAdminPassword(password);
                break;
                case 3:
                String fname;
                System.out.println("Please enter new first name");
                fname = input.nextLine();
                adminUser.changeAdFirstName(fname);
                break;
                case 4:
                String lname;
                System.out.println("Please enter new last name");
                lname = input.nextLine();
                adminUser.changeAdLastName(lname);
                break;
                /* case 5:
                *  case 6:
                *  case 7:
                *  case 8:
                */ //still to be implemented
                default:    
                System.out.println("Please check the list and re-enter a number");
                break;

            }
            
        System.out.println("Please select one of the following options or enter -1 to exit");
        System.out.println("1- Change Admin Username");
        System.out.println("2- Change Admin Password");
        System.out.println("3- Change Admin Firstname");
        System.out.println("4- Change Admin Lastname");
        System.out.println("5- Add Train");
        System.out.println("6- Remove Train");
        System.out.println("7- Update Train");
        System.out.println("8- Generate Report");
        input.close();
        }
    }


    /*
    * Passenger options function will go here
    */

}
