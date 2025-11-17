import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        while(N>1){
            int[][] newArr = new int[N/2][N/2];
            
            for(int i = 0; i<N; i+=2){
                for(int j = 0; j<N; j+= 2){
                    int[] tmp = {
                        arr[i][j],
                        arr[i+1][j],
                        arr[i][j+1],
                        arr[i+1][j+1]
                    };
                    Arrays.sort(tmp);                    
                    newArr[i/2][j/2] = tmp[2];
                }                
            }
            arr = newArr;
            N /= 2;
        }
        System.out.println(arr[0][0]);
    }
}