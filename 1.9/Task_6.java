import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a;
        int N = in.nextInt();
        //int M = in.nextInt();
        a = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i+j==N-1){a[i][j]=1;}
                if(i+j>N-1){a[i][j]=2;}
                if(i+j<N-1){a[i][j]=0;}
            }
        }
            for (int i = 0; i <N; i++) {
                for (int j =0; j<N; j++) {
                    System.out.print(a[j][i] + " ");
                }
                System.out.println();
            }
    }
}


