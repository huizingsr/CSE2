//Sicco Huizing
//coin flip methods: heads=1 tails=0

import java.util.Scanner;
public class flips{
    public static void main (String [] args){
        Scanner myScanner=new Scanner (System.in);
        int x=0;
        
        while(x<1){
             System.out.print("Enter in the number of flips ");
         int s=myScanner.nextInt();
         if((s>0) && (s<100)){
         flip2(s);
         x=0;
         }
         else if (s==0){
              int cat=flip();
              int a=0; //heads
              int b=0; //tails
                 if(cat==1){
                       a+=1;
                             }
                        else{
                         b+=1;
                                    }
    System.out.println(" The number of heads are "+a+" and the number of tails is "+b+""); 
            x=0;
         }
         else{
             x=1;
         }
        }
    }
        
        
        
public static int flip () {
    double random=Math.random();// if random less than 0.5 than its a head
    int heads=0;
    if(random<0.5){
        heads+=1;
    }
    else{
        
    }
    return heads; 
}
public static void flip2 (int n){
    int i=0;
    int head=0;
    int tail=0;
    while(i<n){
     int cat=flip();
     if(cat==1){
         head+=1;
     }
     else{
         tail+=1;
     }
       i++;
    }
    System.out.println(" The number of heads are "+head+" and the number of tails is "+tail+"");
}
}