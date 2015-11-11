import java.util.Scanner; //import scanner utility
public class arrays { //declare public class 
public static void main (String [] args) { //
int a=20;
int b=10;
int c=30;
 int [] array1 = new int [a];
        int i=0;
        for (i=0; i<20; i++){ //allocate random number to each array value
            array1[i]= (int)(Math.random()*100);
           
        }
        sort(array1,a);
        
        int [] array2 = new int [b];
        int x=0;
        for (x=0; x<10; x++){ //allocate random number to each array value
            array2[x]= (int)(Math.random()*100);
           
        }
        sort(array2, b);
        
        int [] array3=new int [c];
        System.arraycopy(array1, 0, array3, 0,  array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        sort(array3,c);
        for (int z=0; z<c; z++){ //allocate random number to each array value
            System.out.println("" +array3[z]+"");
        }
}
        public static void sort(int[] arrayc, int d){
            int temp = 0;
            for(int n=0; n<d; n++){
                for(int s=n; s<d; s++)
                if(arrayc[n]>arrayc[s]){
                    temp = arrayc[n];
                    arrayc[n]=arrayc[s];
                    arrayc[s] = temp;
                }
            }
        }

}
