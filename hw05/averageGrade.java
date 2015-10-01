//Sicco Huizing
//hw05
//ask for grades in a certain range stop at 999

import java.util.Scanner;
public class averageGrade {
    public static void main (String [] args){
        Scanner myScanner= new Scanner (System.in) ;
        int i=0;//incrament for the while
        double sum=0; //vairable to contain the sum
        double grade; //the input grade
        int incrament=0;
    while(i<1){ //set up while loop that will stopo when i is because >=1
    System.out.print("Please enter in your grade"); //prompt new variable
    
    if(myScanner.hasNextDouble()){ //check if a double
        grade=myScanner.nextDouble(); //if a double then initialize
        if(0<=grade&&grade<=100){ //if between the two numbers
        sum+=grade; //add the grade to the sum
        incrament+=1; //this will be the number to divide by for the average
        i=0;}
        else if (grade==999){ //if the number is 999 stop 
            i=1;
        }
        else if (0>grade||grade>100){ //not in range, return to begining of loop
        System.out.println("You did not enter a valid input");
        i=0;
        }
        }
    
    else{ //if not any of the above return to begginging of the loop
        String cat=myScanner.next(); //store the value otherwise itll go cray
         System.out.println("You did not enter a valid input");
        i=0;
    }
    
    }  
    
double average=sum/incrament; //do calulation for average
System.out.println("The average of the grades is "+average+"");
}
}