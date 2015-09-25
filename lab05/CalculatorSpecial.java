//Sicco Huizing
//lab05
//Special Calculator

import java.util.Scanner;
public class CalculatorSpecial{
    public static void main (String [] args){
       int i=0;
       
       while(i<1){
       
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
         System.out.println("Type N or n to stop otherwise program will continue");
         String yas=myScanner.next();//take in as scanner
         if(yas.equals("n")||yas.equals("N")){
             i=1;
         }
         else{
             i=0;
         }
        }
    }
}