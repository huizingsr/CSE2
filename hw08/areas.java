//Sicco Huizing
//find the area of various shapes using methods
//


import java.util.Scanner;
public class areas{
    public static double area (int radius){
        double areacircle=Math.PI*Math.pow(radius,2);//calculate the area of a circle
        return areacircle;
    }
    public static int area (int length, int width){ //2 arguments
        int arearectangle=length*width;//calculation for a rectangle
        return arearectangle;
    }
    public static double area (double height, double base1, double base2){ //3 arguments
        double areatrapezoid=((base1+base2)/2)*height; //calculatio for area of trapezoid_used doubles because in calc there canbe decimals
        return areatrapezoid;
    }
    public static void main (String [] args){
         Scanner myScanner=new Scanner (System.in);
         int i=0;
         
         while(i<1){ //set up while loop to circle through options
             System.out.print("Please enter in circle, rectangle, trapezoid or exit if you wish to leave the program");
             String a=myScanner.next(); //take in the next string input
             if(a.equals("circle")){ //if circle has been entered
                 System.out.print("please enter in the radius"); //prompt for radius
                      int r=myScanner.nextInt(); //store value
                      double circle=area(r); //prompt method
                      System.out.print("The area of the circle is "+circle+""); //print answer
                      i=1; //end loop
             }
             else if (a.equals("rectangle")){ //if rectsagnle entered
                 System.out.print("please enter in the length and width"); //prompt for more values
                      int l=myScanner.nextInt(); //length
                      int w=myScanner.nextInt(); //width
                      int rectangle=area(l,w); //prompt rectangle method
                       System.out.print("The area of the rectangle is "+rectangle+""); //printout
                      i=1;
             }
             else if(a.equals("trapezoid")){ //trapezoid
                  System.out.print("please enter in the height, base 1, and base2");
                      int h=myScanner.nextInt(); //height
                      int b=myScanner.nextInt();//base 1
                      int b2=myScanner.nextInt(); //base 2
                      double trap=area(h,b,b2); //prompt the right method
                       System.out.print("The area of the rectangle is "+trap+""); //print out
                      i=1;// end loop
             }
             else if(a.equals("exit")){ //if they choose just to exit, leave loop
                 i=1;
             }
             else{ //enter in the wrong thing cycle through
                 i=0;
             }
         }
         
         
    }
}