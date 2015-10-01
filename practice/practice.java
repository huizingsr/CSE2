import java.util.Scanner;
public class practice{
    public static void main (String [] args){
        Scanner myScanner=new Scanner (System.in);

int x = 0, y = 0;
        while (x < 3)
        {
            switch (x + y)
            {
                case 0:
                    x++;
                case 1:
                case 2:
                    y++;
                    break;
                case 3:
                    x++;
                    break;
                default:
                    y = 0;
                    break;
            }
            System.out.print(y);
        }
    }
}