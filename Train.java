
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mostafa Gado
 */
class Train {
    
    private double trainFair;
    private int numberOfSeats;
    private int numberOfCars;
    private int trainNumber;
    private String stationName;
    private String stationLocation;
    private static int countNumberOfSeats; 
    private static int trainNumberGenerator =0; // hanstakhdemo f haga??
    private String workingCondition; // function to check the working condition of the train

    ArrayList<Integer> seats = new ArrayList<>();
    
    
    void addNewSeat(int numberOfSeats){
        //seats S1 = new seats(numberOfSeats);
        seats.add(numberOfSeats);
    
    };
    
    void removeSeat(int seatNumber){
    for(int i =0; i < seats.size();i++){
    seats.get(i);
    if ( seats.get(i)== seatNumber){
    seats.remove(i);
    }
    }
    }
    
    void updateSeat(int seatNumber){
    Scanner seat = new Scanner(System.in);
        System.out.println("please enter the seat number that you wish to update");
        int updateSeat = seat.nextInt();
        
        for (int i =0 ; i < seats.size();i++){
        seats.get(i);
        if (seats.get(i)== seatNumber){
        int temp;
        temp = seat.nextInt();
        }
        }
    }

    public static int getCountNumberOfSeats() {
        return countNumberOfSeats;
    }

    public static void setCountNumberOfSeats(int countNumberOfSeats) {
        Train.countNumberOfSeats = countNumberOfSeats;
    }

    public String getWorkingCondition() {
        return workingCondition;
    }

    public void setWorkingCondition(String workingCondition) {
        this.workingCondition = workingCondition;
    }

    public ArrayList<Integer> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Integer> seats) {
        this.seats = seats;
    }

   
    
    
    
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public Train(int numberOfSeats, int numberOfCars, int trainNumber, String stationName, String stationLocation,String workingCondition) {
        this.numberOfSeats = numberOfSeats;
        this.numberOfCars = numberOfCars;
        this.trainNumber = trainNumber;
        this.stationName = stationName;
        this.stationLocation = stationLocation;
        this.workingCondition = workingCondition;
    }

    @Override
    public String toString() {
        return "Train{" + "numberOfSeats=" + numberOfSeats + ", numberOfCars=" + numberOfCars + ", trainNumber=" + trainNumber + ", stationName=" + stationName + ", stationLocation=" + stationLocation + '}';
    }
    
    //public static int getTrainNumberGenerator() {
    //    return trainNumberGenerator;
    //}

    //public static void setTrainNumberGenerator(int trainNumberGenerator) {
    //    Train.trainNumberGenerator = trainNumberGenerator;
    //}
    Train(){
    countNumberOfSeats++;
    //trainNumber = trainNumberGenerator;
    }
    
}
