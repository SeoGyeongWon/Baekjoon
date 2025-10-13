import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case =0; test_case<T; test_case++ ){
            int[][] point = new int[4][2];
            
            for(int i = 0; i<4; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                point[i][0] = Integer.parseInt(st.nextToken());
                point[i][1] = Integer.parseInt(st.nextToken());
            }
            long[] dist = new long[6];
            int idx = 0;
            for(int i =0; i<4; i++){
                for(int j= i+1; j<4; j++){
                    dist[idx++] = getDistance(point[i],point[j]);
                }
            }
            Arrays.sort(dist);
            if(dist[0] == 0){
                System.out.println(0);
            }
            else if(dist[0] == dist[3] && dist[4] == dist[5] && dist[4] == 2*dist[0]){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
    static long getDistance(int[] a, int[] b){
        long dx = a[0]-b[0];
        long dy = a[1] - b[1];
        return (dx*dx + dy*dy);
    }
}