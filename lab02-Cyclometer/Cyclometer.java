//Cyclometer

public class Cyclometer{
    public static void main (String [] args){
        int secsTrip1=480; //int the trip in seconds
        int secsTrip2=3220; //int the other information
        int countsTrip1=1561;
        int countsTrip2=9037;
        double wheelDiameter=27.0;
        double PI=3.14159; //int the constants to be used later
        int feetPerMile=5280;
        int inchesPerFoot=12;
        int secondsPerMinute=60;

            double distanceTrip1, distanceTrip2, totalDistance;
            System.out.println("Trip 1 took"+ (secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts."); //compute calcualtions for the trip duration
            System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and has "+countsTrip2+" counts.");
            distanceTrip1=countsTrip1*wheelDiameter*PI; //converting the counts to a distance
            distanceTrip1/=inchesPerFoot*feetPerMile; //do the calculations
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
            totalDistance=distanceTrip1+distanceTrip2;
            System.out.println("Trip 1 was "+distanceTrip1+" miles"); //print out tge final distances
            System.out.println("Trip 2 was "+distanceTrip2+" miles");
            System.out.println("The total distance was "+totalDistance+"miles");
            
    }
}