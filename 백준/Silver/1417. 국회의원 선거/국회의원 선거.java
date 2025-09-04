import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dasom = sc.nextInt();
        if(n == 1){
            System.out.println(0);
        }
        else{
            int[] others = new int[n-1];
            for(int i = 0 ; i<n-1; i++){
                others[i] = sc.nextInt();
            }
            int count =0;
            while(true){
                Arrays.sort(others);
                if(dasom > others[n-2]){
                    break;
                }
                others[n-2] = others[n-2] -1;
                dasom ++;
                count++;
            }
            System.out.println(count);
        }
    }
}