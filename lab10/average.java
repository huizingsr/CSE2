//Sicco huizing

import java.util.Scanner; //import scanner utility
public class average { //declare public class 
public static void main (String [] args) { //declare main method 
        Scanner myScanner= new Scanner (System.in); //declare scanner utility
        System.out.println("Please input the number of values to be stored: ");
        int n=myScanner.nextInt(); //declare n as number of clips
        int [] array; //declaration
        array = new int [n];
        int i=0;
        for (i=0; i<n; i++){ //allocate random number to each array value
            array[i]= (int)(Math.random()*100);
            System.out.println("Number: " +array[i]);
        }
        double result=0.0;
        int k=0;
        for (k=0; k<array.length; k++) { //calculate sum of random numbers
            result=result+array[k];
        }
        double average;
        average=(result)/array.length; //calculate average of array numbers
        System.out.println("The sum is " +result);
        System.out.println("The average is " +average);
        int j=0;
        for (j=0; j<n; j++) {
            if (array[j] >= average ){ //check which values are greater than average
                System.out.println("Value of array greater than or equal to the average is " +array[j]); //print values greater than or equal to average
            }
            else {
                j=1;
            }
        }
} //close main method    
}//close public class