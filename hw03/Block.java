import java.util.Scanner;
public class Block {
    public static void main (String [] args){
        Scanner myScanner= new Scanner (System.in) ;
        System.out.println("Enter the length of the block"); //promt user for length
        double length=myScanner.nextDouble(); //store that value as a double
        System.out.println("Enter the width of the block"); //same as above but for wifth
        double width=myScanner.nextDouble();
        System.out.println("Enter the height of the block");
        double height=myScanner.nextDouble();
        double volume=length*width*height; //calculate volume
        double surfaceA=length*width*2+length*height*2+width*height*2;//calculate surfACE AREA
        System.out.println("The volume of the block with dimmensions "+length+"x"+width+"x"+height+" is "+volume+". The surface area is"+surfaceA+""); // print the values
    }
}