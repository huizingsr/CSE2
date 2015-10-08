import java.util.Scanner;
public class encrypted_x{
    public static void main (String [] args){
        Scanner myScanner=new Scanner (System.in);
        
        System.out.print("Input a number between 0 and 100");
        int input = myScanner.nextInt(); 
        if(input>0&&input<100){
         
        }
        else{
            System.exit(-1); 
        }
            int a=0;
        
        for(int i=0; i<input; i++){
            for(int j=0; j<input; j++){
            
                if(a==j||(input-1-a)==j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                }
            
            a++;
            System.out.println();
        }
        }
    }


    