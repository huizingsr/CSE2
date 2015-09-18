//Sicco Huizing
// Take in two numbers and then calcualte , check if operatr is valid

import java.util.Scanner;
public class Calculator{
    public static void main (String [] args){
        Scanner myScanner=new Scanner (System.in); //initialize the scannerS
    System.out.print("Please enter in your operator"); //first take in the operator
        String s=myScanner.nextLine();//take in as scanner
           System.out.print("Please enter in two numbers"); // take in the numbers
        int a=myScanner.nextInt(); //variables a and b initialized
        int b=myScanner.nextInt(); 
        int cat; //the product
       
        
        switch (s) { //switch statment for possible combos of operator
            case "+": 
                cat=a+b;
                System.out.println(" The answer to your inputs is "+a+" "+s+" "+b+"="+cat+"");
                break;
            case "*":
                cat=a*b;
                System.out.println(" The answer to your inputs is "+a+" "+s+" "+b+"="+cat+"");
                 break;
            case "-":
                cat=a-b;
                System.out.println(" The answer to your inputs is "+a+" "+s+" "+b+"="+cat+"");
                 break;
            case "/": 
                cat=a/b;
                System.out.println(" The answer to your inputs is "+a+" "+s+" "+b+"="+cat+"");
                 break;
            default: //when a character is entered which is not valid
            System.out.println("System is invalid");
             break;
        }
    }
}
        
        