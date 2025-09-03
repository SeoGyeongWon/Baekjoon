import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i =0; i<n; i++){
            str[i] = sc.next();
        }
        char[] result = str[0].toCharArray();
        for(int j=1; j<n; j++){
        for(int i=0; i< result.length; i++){
            if(result[i]=='?'){
                continue;
            }
            else{
                if(result[i]!=str[j].charAt(i)){
                    result[i] = '?';
                }
            }
        }
        }
                   for(char c : result){
                       System.out.print(c);
                   }
        
    }
}