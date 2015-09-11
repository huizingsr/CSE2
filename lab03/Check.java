import java.util.Scanner;
public class Check{
    public static void main (String [] args){
        
Scanner myScanner= new Scanner (System.in);
System.out.print("Enter the original cost of the check in the from xx.xx?");
double checkCost=myScanner.nextDouble();
System.out.print("Ente the percentage tip that you wish to pay as a whole number (in the form xx) :");
double tipPercent=myScanner.nextDouble();
tipPercent/=100;// we want to convert the persent to a value
System.out.print("Enter the number of people who went out to dinner : ");
int numPeople=myScanner.nextInt();
double totalCost;
double costPerPerson;
int dollars, dimes, pennies;
totalCost= checkCost*(1+tipPercent);

costPerPerson=totalCost/numPeople;
dollars=(int)costPerPerson;
dimes= (int) (costPerPerson*10)%10;
pennies=(int) (costPerPerson*100)%10;
System.out.println("Each person in the group owes $ " + dollars + '.'+dimes +pennies);
}
}