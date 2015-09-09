//Evan Vail
//CSE2
//9-4-15
//lab02

//Cyclomterer Program
// calculates distance from time and wheel rotations for a bike

public class Cyclometer {
    public static void main(String[] args){
        
    //input data
    int secsTrip1=480;
    int secsTrip2=3220;
    int countsTrip1=1561;
    int countsTrip2=9037;
    double wheelDiameter=27.0,
    PI=3.141592,
        feetPerMile=5280,
        inchesPerFoot=12,
        secondsPerMinute=60;
//variables
    double distanceTrip1;
    double distanceTrip2;
    double distanceTrip3;
    double totalDistance;
    double minsTrip1;
    double minsTrip2;
    
    //calculations to store values into variables for print out
    minsTrip1 = secsTrip1 / secondsPerMinute; //seconds to minutes
    minsTrip2 = secsTrip2 / secondsPerMinute;
    
    distanceTrip1=countsTrip1*wheelDiameter*PI; //distance in inches
    distanceTrip1/=inchesPerFoot*feetPerMile;//distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //distance in miles
    totalDistance=distanceTrip1+distanceTrip2; //sum of both trips 
    
    
    
    
    System.out.println("Trip 1 took " + minsTrip1 + " minutes and had " 
    + countsTrip1+" counts");
    System.out.println("Trip 2 took " + minsTrip2 + " minutes and had " 
    + countsTrip2+" counts");    
    System.out.println("Trip 1 was " + distanceTrip1 + " miles");
    System.out.println("Trip 2 was " + distanceTrip2 + " miles");
    System.out.println("The total distance was " + totalDistance + " miles");
    }
}