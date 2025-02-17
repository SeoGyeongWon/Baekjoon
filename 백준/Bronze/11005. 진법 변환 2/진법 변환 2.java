import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        sc.close();
        System.out.println(convert(n,b));
        
    }
    public static StringBuilder convert(int n, int b){
        StringBuilder result = new StringBuilder();
        
        while(n>0){
            int c =n%b;
            if(c<10){
                result.append((char)('0'+c));
            }
            else{
                result.append((char)('A'+c-10));
            }
            n/=b;
        }
        return result.reverse();
    }
}