import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder sb = new StringBuilder();
        for(char c : a.toCharArray()){
            
            int ascii = (int)c;
            
            if(ascii >= 65&& ascii <= 90){
                sb.append((char)(ascii+32));
            }
            else if(ascii>=97 && ascii<=122){
                sb.append((char)(ascii-32));
            }
        }
        System.out.print(sb);
    }
}