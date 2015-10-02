//Sicco Huizing
//lab06

import java.util.Scanner;
public class timeSheets{
    public static void main (String [] args){
 Scanner myScanner=new Scanner (System.in); //initialize the scannerS
 int x=0;
 int a=0;
 while(x<1){
 System.out.print("Enter in the number of employees");
    a=myScanner.nextInt();
    if (a<0){
        x=0;
    }
    else{
        x=1;
    }
 }
    int i=0;
    double b,c,d,e,f,pay;
    double sum=0;
    while(i<a){
         System.out.print("Enter in the pay for this employee");
           pay=myScanner.nextDouble();
           pay/=100;
            System.out.print("Enter in the hours worked this week");
              b=myScanner.nextDouble();
                c=myScanner.nextDouble();
                  d=myScanner.nextDouble();
                    e=myScanner.nextDouble();
                      f=myScanner.nextDouble();
                      sum+=(f+b+c+d+e)*pay;
                      i++;
    }
    System.out.println("The sum of money earned for all people worked is "+sum+"");
    
    }
}

    