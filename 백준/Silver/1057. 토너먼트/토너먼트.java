import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n  = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int round = 1;
        while(a!=b){
            a = (a+1)/2;
            b = (b+1)/2;
            round++;
        }
        System.out.println(round-1);
    }
}