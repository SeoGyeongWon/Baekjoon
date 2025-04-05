import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0]= Integer.parseInt(st.nextToken());
            arr[i][1]= Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(int[] num : arr){
            sb.append(lcm(num[0],num[1])).append("\n");
        }
   
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        }
        public static int gcd(int a, int b){
            if(b==0){return a;}
            return gcd(b,a%b);
        }
        public static int lcm(int a, int b){
            return a*(b/gcd(a,b));
        }
   
}
