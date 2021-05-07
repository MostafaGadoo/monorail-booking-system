
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
    static final Map<Integer,String> convertToDay;

    static {
    HashMap<Integer,String> temp = new HashMap< Integer,String> ();
    
    temp.put(1,"Sunday");
    temp.put(2,"Monday");
    temp.put(3,"Tuesday");
    temp.put(4,"Wednesday");
    temp.put(5,"Thursday");
    temp.put(6,"Friday");
    temp.put(7,"Saturday");
    convertToDay =  Collections.unmodifiableMap(temp);
    }

    private String startCity;
    private String endCity;
    private HashMap<String,Integer> operatingdays;
    private Double trianFare;
    private static int trainNumberGenerator =0;
    private int trainNumber;
    private int numberOfSeats;

    public Train(String startCity, String endCity, int trainNumber, int numberOfSeats) {
        this.startCity = startCity;
        this.endCity = endCity;
        this.trainNumber = trainNumber;
        this.numberOfSeats = numberOfSeats;
    }
    
    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }

    public HashMap<String, Integer> getOperatingdays() {
        return operatingdays;
    }

    public void setOperatingdays(HashMap<String, Integer> operatingdays) {
        this.operatingdays = operatingdays;
    }

    public Double getTrianFare() {
        return trianFare;
    }

    public void setTrianFare(Double trianFare) {
        this.trianFare = trianFare;
    }

    public static int getTrainNumberGenerator() {
        return trainNumberGenerator;
    }

    public static void setTrainNumberGenerator(int trainNumberGenerator) {
        Train.trainNumberGenerator = trainNumberGenerator;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    
//    protected void setOperatingDay(int Days){
//    operatingdays = new HashMap < String, Integer> ();
//    int temp = Days;
//    
//    while(temp!=0){
//    int rem = temp%10;
//    String s = convertToDay.get(rem);
//    operatingdays.put(s,1);
//    temp = temp/10;
//    }
//    }
    
    
    Train()
    {
    trainNumberGenerator++;
    trainNumber = trainNumberGenerator;
    };
}