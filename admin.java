/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Scanner;
    public class Admin extends User {
    public Admin(String username, String password, String firstName, String lastName) {
        super(username, password, firstName, lastName);
        
    }

    ArrayList<Train> arr;
   
public void AddTrain(String startCity, String endCity, int trainNumber, int numberOfSeats){
    Train T1=new Train(startCity, endCity, trainNumber, numberOfSeats);
    arr.add(T1);
}
public Train RemoveTrain(int TrainNumber){
    Train T;
    for(int i=0;i<arr.size();i++){
        T=arr.get(i);
        if(T.getTrainNumber()==TrainNumber)
           
        
    
     return arr.remove(i);
    }
        return null;
}
public void UpdateTrain(int TrainNumber){
    Scanner S1=new Scanner(System.in);
       Train T;
       System.out.println("Select the Train number to update");
TrainNumber=S1.nextInt();
                System.out.println("1) Start City");
		System.out.println("2) destination city");
		System.out.println("3) Number of seats");
                int choice = S1.nextInt();
    for(int i=0;i<arr.size();i++){
        T=arr.get(i);
        T.setNumberOfSeats(i);
        if(T.getTrainNumber()==TrainNumber)
 
		S1.nextLine();
		String temp;
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter new Start City:");
				temp = S1.nextLine();
				T.setStartCity(temp);
				break;
			case 2:
				System.out.println("Enter New end City:");
				temp = S1.nextLine();
				T.setEndCity(temp);
				break;
			

			case 3:
				System.out.println("Enter the Total Number of seats:");
				int seats = S1.nextInt();
				T.setNumberOfSeats(seats);
				break;
                                //case 4:
//				System.out.println("Enter the days the Train operates on now:");
//				int opDay = S1.nextInt();
//				T.setOperatingDays(opDay);
//				break;
			default:
				System.out.println("Inavlid option selected. Please enter again:");
		}
		
	
}
}
    public void changeAdminPassword(String password) {
        setPassword(password);
    }
    public void changeAdminUsername(String username) {
        setUsername(username);
    }
    public void changeAdFirstName(String firstName) {
        setFirstName(firstName);
    }
    public void changeAdLastName(String lastName) {
        setLastName(lastName);
    }
}
