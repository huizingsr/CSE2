//Sicco Huizing
//lab08
//median mean
import java.util.Scanner;
public class methods{
    public static void main (String [] args){
        Scanner myScanner=new Scanner (System.in);
        System.out.print("Enter in 10 numbers ");
      
         
         
         int a=myScanner.nextInt();
         int b=myScanner.nextInt();
         int c=myScanner.nextInt();
         int d=myScanner.nextInt();
       int e=myScanner.nextInt();
        int f=myScanner.nextInt();
   int g=myScanner.nextInt();
         int h=myScanner.nextInt();
         int i=myScanner.nextInt();
         int j=myScanner.nextInt();
        int sum=a+b+c+d+e+f+g+h+i+j;
        double mean1= findmean(sum);
        double median1=findmedian(e,f);
        print(mean1, median1);
    }
        
        public static int findmean(int mean){
        int average=mean/10;
        return average;
        }
       
         public static double findmedian(double x, double y){
             double yas=(x+y)/2;
             return yas;
        
    }
    public static void print(double s, double t){
        System.out.println("The average is "+s+"");
          System.out.println("The average is "+t+"");
        
    }
    

}

        