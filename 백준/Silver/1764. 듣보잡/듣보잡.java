import java.util.*;

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        
        int m = Integer.parseInt(st.nextToken());
        
        Set<String> dut = new HashSet<>();
        
        for(int i=0; i<n; i++){
            dut.add(br.readLine());
        }
        
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i<m; i++){
            String name = br.readLine();
            if(dut.contains(name)){
                result.add(name);
            }
        }
        br.close();
        
        Collections.sort(result);
        
        int count = 0;
        StringBuilder sb= new StringBuilder();
        
        for(String name : result){
            sb.append(name).append("\n");
            count++;
        }
        
        
        bw.write(count+"\n"+sb);
        bw.flush();
        bw.close();
    }
}