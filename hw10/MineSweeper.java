//Sicco Huizing
//HW10


import java.util.Scanner; //import scanner utility
public class MineSweeper { //declare public class 
public static void main (String [] args) { 
          Scanner myScanner= new Scanner (System.in);
          int x=0;
          int N=0;
          int M=0;
          while(x<1){ //check while loop to see if N is between 2 and 30
     System.out.print("Please enter the size of the board");
      N=myScanner.nextInt();
    if(N>=2&&N<=30){
        x=1;
    }
    else{
        x=0;
    }
          }
          x=0;
          while(x<1){ //while loop to check if M is between 0 and N*N
               System.out.print("Please enter the number of mines"); 
      M=myScanner.nextInt();
     if(M>0&&M<=(N*N)){
         x=1;
     }
     else{
         x=0;
     }
          }
          
      
       
        boolean[][] bombs = new boolean[N+2][N+2]; //this will set the bombs, if a bomb is laid it will be true

        for (int i = 0; i < M; i++){
        int a=(int)(Math.random()*N); //get random numbers
        int b=(int)(Math.random()*N);
        if(bombs[a][b]==true){ //if a bomb has already been layed in the same location, cycle through again
            i=i-1;
        }
        else{
        bombs[a][b]=true; //if bomb hasnt been laid then lay a bomb
        }
        }
        
        int[][] index = new int[N+2][N+2]; //index will be used to check incrament if a bomb is nearby
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= N; j++){
                // (ii, jj) indexes neighboring cells
                for (int ii = i - 1; ii <= i + 1; ii++){
                    for (int jj = j - 1; jj <= j + 1; jj++){
                        if (bombs[ii][jj]) index[i][j]++; //if bombs are in the vecinity, increase the surrounding boxes
}
}
}
}
        // print solution 
        System.out.println();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (bombs[i][j]) System.out.print("M ");
                else             System.out.print(index[i][j] + " ");
            }
            System.out.println();
        }

    }
}