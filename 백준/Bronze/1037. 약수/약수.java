import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        if(n== 1){
            int a = sc.nextInt();
            result = a*a;
        }
        else{
            int[] arr = new int[n];
            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            result = arr[0] * arr[n-1];
        }
        System.out.println(result);
    }
}