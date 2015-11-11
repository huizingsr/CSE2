//Sicco Huizing
//HW10


import java.util.Scanner; //import scanner utility
public class MineSweeper { //declare public class 
public static void main (String [] args) { 
          Scanner myScanner= new Scanner (System.in);
     System.out.print("Please enter the size of the board");
     int N=myScanner.nextInt();
    
     
      System.out.print("Please enter the number of mines");
     int M=myScanner.nextInt();
       // game grid is [1..M][1..N], border is used to handle boundary cases
        boolean[][] bombs = new boolean[N+2][N+2];

        for (int i = 0; i < M; i++){
        int a=(int)(Math.random()*N);
        int b=(int)(Math.random()*N);
        if(bombs[a][b]==true){
            i=i-1;
        }
        bombs[a][b]=true;
        }
     
        // sol[i][j] = # bombs adjacent to cell (i, j)
        int[][] index = new int[N+2][N+2];
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= N; j++){
                // (ii, jj) indexes neighboring cells
                for (int ii = i - 1; ii <= i + 1; ii++){
                    for (int jj = j - 1; jj <= j + 1; jj++){
                        if (bombs[ii][jj]) index[i][j]++;
}
}
}
}
        // print solution
        System.out.println();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (bombs[i][j]) System.out.print("* ");
                else             System.out.print(index[i][j] + " ");
            }
            System.out.println();
        }

    }
}