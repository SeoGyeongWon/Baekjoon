import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        char[][] arr = new char[n][n];
        
        for(int i =0; i<n; i++){
            arr[i] = sc.next().toCharArray();
        }
        
        int maxCount = 0;
        for(int i = 0; i<n; i++){
            boolean[] isFriend = new boolean[n];
            
            for(int j =0; j<n; j++){
                if(i==j){
                    continue;
                }
               if(arr[i][j] == 'Y'){
                   isFriend[j] = true;
               }
                else{
                    for(int k =0; k<n; k++){
                        if(arr[i][k] == 'Y' && arr[k][j] == 'Y'){
                            isFriend[j] = true;
                            break;
                        }
                    }
                }
            }
            int count = 0;
            for(boolean b : isFriend){
                if(b)count++;
            }
            maxCount = Math.max(maxCount,count);
        }
        System.out.println(maxCount);
        
    }
}