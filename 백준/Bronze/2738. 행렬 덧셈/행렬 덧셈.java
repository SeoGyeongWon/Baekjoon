import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] matrix1 = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j =0; j<m; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        
        int[][] matrix2 = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j =0; j<m; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}