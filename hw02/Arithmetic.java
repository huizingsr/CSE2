//Arithmetic.java
public class Arithmetic{
    
// add main method
    public static void main(String [] args){
int nSocks=3;
double sockCost=2.58;
double totalSock;

int nGlasses=6;
double glassCost$=2.29;
double totalGlass;

int nEnvelopes=1;
double envelopeCost$=3.25;
double totalEnvelope;
double taxPercent=0.06;

System.out.println("The item being bought are 3 socks at $2.58"); //print out general descriptiom
totalSock=nSocks*sockCost; //calculate the total sock before tax
System.out.println("The total cost before tax is "+totalSock+""); //print out that number
double SockTax=totalSock*taxPercent; //find tax paid
SockTax=SockTax*100; //multiply by 100 to get the two decimals
int SockTax1=(int) SockTax; //chop off the rest of the double
double SockTax2=(double) SockTax1; //turn it back to decimal
SockTax2=SockTax2/100; // make the tax a decimal to two places like cash
System.out.println("The tax on the socks was "+SockTax2+""); //prin out
double TotalSox=SockTax2+totalSock; //find total with tax
TotalSox=TotalSox*100; //repeat decimal calculations
int TotalSox1=(int) TotalSox;
double TotalSox2=(double) TotalSox1;
TotalSox2=TotalSox2/100;
System.out.println("The total cost of socks was"+TotalSox2+""); //print out total with tax

System.out.println("The item being bought are 6 glasses at $2.29"); //repeat procdure from previous
totalGlass=nGlasses*glassCost$;
System.out.println("The total cost before tax is "+totalGlass+"");
double GlassTax=totalGlass*taxPercent;
GlassTax=GlassTax*100;
int GlassTax1=(int) GlassTax;
double GlassTax2=(double) GlassTax1;
GlassTax2=GlassTax2/100;
System.out.println("The tax on the glasses was "+GlassTax2+"");
double TotalGlasss=GlassTax2+totalGlass;
System.out.println("The total cost of Glasses was"+TotalGlasss+"");

System.out.println("The item being bought is one envelope at 3.25");
totalEnvelope=nEnvelopes*envelopeCost$;
System.out.println("The total cost before tax is "+totalEnvelope+"");
double EnvelopeTax=totalEnvelope*taxPercent;
EnvelopeTax=EnvelopeTax*100;
int EnvelopeTax1=(int) EnvelopeTax;
double EnvelopeTax2=(double) EnvelopeTax1;
EnvelopeTax2=EnvelopeTax2/100;
System.out.println("The tax on the envelope was "+EnvelopeTax2+"");
double TotalEnvelopes=EnvelopeTax2+totalEnvelope;
System.out.println("The total cost of envelope was "+TotalEnvelopes+"");

Double TotalTotal=TotalEnvelopes+TotalGlasss+TotalSox2;
System.out.println("The total purchse comes to $ "+TotalTotal+""); //print out last toal


}
}