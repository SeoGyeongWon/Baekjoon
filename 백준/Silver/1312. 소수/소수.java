import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int n = sc.nextInt();
        
        int na = a%b;
        
        int result = 0;
        
        for(int i = 0; i<n; i++){
            na *=10;
            result = na/b;
            na %=b;
        }
        System.out.println(result);
    }
}