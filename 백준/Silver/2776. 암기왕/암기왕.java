import java.util.*;
import java.io.*;

class Main{
    static int n;
    static int[] s1;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));            

        int T = Integer.parseInt(br.readLine());
        
        for(int test_case = 0; test_case<T; test_case++){
            n = Integer.parseInt(br.readLine());
            s1 = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i<n; i++){
                s1[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(s1);

            int m = Integer.parseInt(br.readLine());
            
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i<m; i++){
                binarySearch(Integer.parseInt(st.nextToken()));
            }
        }
        System.out.print(sb);
    }
    static void binarySearch(int target){
        int start = 0;
        int end = n-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(s1[mid] == target){
                sb.append("1\n");
                return;
            }
            if(s1[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        sb.append("0\n");
    }
}