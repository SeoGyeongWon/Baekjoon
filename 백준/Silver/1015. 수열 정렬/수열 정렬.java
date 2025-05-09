import java.util.*;

public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
    
    int[] arr = new int[n];
    int[] cmp = new int[n];
    for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
        cmp[i] = arr[i];
               
    }
    Arrays.sort(arr);
    for(int i = 0; i<n; i++){
        for(int j =0; j<n; j++){
            if(cmp[i] == arr[j]){
                System.out.print(j+" ");
                arr[j] = Integer.MIN_VALUE;
                break;
            }
        }
    }
    }
}