import java.util.Scanner;
public class practice{
    public static void main (String [] args){
        Scanner myScanner=new Scanner (System.in);
        System.out.print("type in a number n");
        int n=myScanner.nextInt();
        int sum1=0;
        int sum=0;
for( int i=1; i==n; i++){
sum+=1/n;
}
for( int i=n; i==1; i--){
sum1+=1/n;
}
int difference=sum-sum1;
System.out.println(""+difference+"");
    }
}