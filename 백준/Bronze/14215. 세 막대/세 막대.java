import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        sc.close();
        
        int max = Math.max(a,Math.max(b,c));
        int sum = a+b+c;
        
        if(max >= sum-max){
            max = sum -max -1;
        }
        System.out.println((sum - Math.max(a,Math.max(b,c))) + max);
    }
}