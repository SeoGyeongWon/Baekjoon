import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        for(int i = 0; i<n; i++){
            String s = br.readLine();
            arr[i] = s.toCharArray();
        }
        int len = Math.min(n,m);
        while(len > 1){
            for(int i =0; i<=n-len; i++){
                for(int j =0; j<=m-len; j++){
                    char num = arr[i][j];
                    if(num == arr[i][j+len-1] && num == arr[i+len-1][j]&& num == arr[i+len-1][j+len-1]){
                        System.out.println(len*len);
                        return;
                    }
                }
            }
            len--;
        }
        System.out.println(len*len);
    }
}