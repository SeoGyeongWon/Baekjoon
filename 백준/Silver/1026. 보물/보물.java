import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
                int[] b = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }    
        for(int i =0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                int tmp = a[i];
                if(a[i]<a[j]){
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        
        for(int i =0;i<n;i++){
         b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        int sum = 0;
        for(int i =0;i<n;i++){
                sum += a[i]*b[i];
        }
        System.out.println(sum);
    }
}