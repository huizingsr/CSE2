import java.util.Scanner;
public class Timer{
public static void main (String[] args){
   Scanner myScanner=new Scanner (System.in); //initialize the scanner
   System.out.print("Enter the current time");// ask for the current time
   int timenow= myScanner.nextInt(); //double for the current time
   System.out.print("Enter the time you will be eating dinner"); //ask for dinner time
   int timed= myScanner.nextInt(); //ask for the time of dinner
   int difference=timed-timenow;//get the difference in time
   int hours=difference/100;//get th hours by finding the remainer
   int minutes=difference-hours*100;//subtract out the hours
   System.out.println("You have "+hours+" hours and "+minutes+" minutes until dinner"); //print out answer
}

}
   