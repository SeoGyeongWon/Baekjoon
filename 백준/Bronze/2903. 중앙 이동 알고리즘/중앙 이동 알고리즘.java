import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int a = (int)Math.pow(2,n)+1;
        
        int result = a*a;
        
        System.out.println(result);
    }
}