import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        
        sc.close();
        
        Arrays.sort(arr);
        
        if(arr[2] >= arr[0]+arr[1]){
            arr[2] = arr[0] + arr[1] -1;
        }
        
        System.out.println(arr[2] + arr[0] + arr[1]);
    }
}