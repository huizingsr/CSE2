//Sicco Huizing
//making pyramids
//hw 06


import java.util.Scanner;
public class pyramid{
    public static void main (String [] args){
        Scanner myScanner=new Scanner (System.in);
        System.out.println("What size pyramid?"); //prompt user for the number of steps
            int n;
             n=myScanner.nextInt(); // take in the input
int s;
        for(int i=n; i>0; i--){ //this first for loop is the basis for all others
           
            for(s=0; s<(i-1) ;s++){ //this loop prints out the space necessay to make it a pyramid
                System.out.print(" "); //printing out the spaces
               
            
            }
             
             
            for(int f=0; f<(2*(n-i)+1); f++){ //this will incrament by the propper stars i.e 1 and then 3 going up by two each time
                System.out.print("*");
                
                }
             
            
            System.out.println(); //print out a new line to make  it actually a pyramid
       
        }
    }
}
