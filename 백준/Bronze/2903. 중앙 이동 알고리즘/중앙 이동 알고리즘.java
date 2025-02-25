import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int a = 0;
        for(int i = 0; i<n; i++){
            a = (1 << n) +1;

            }
            int result = a*a;
            System.out.println(result);
        }
    }