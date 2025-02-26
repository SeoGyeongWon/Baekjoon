import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=num; i++){
            int n = sc.nextInt();
            if(isPrime(n)){
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
    public static boolean isPrime(int n){
        if(n ==1){return false;}
        if(n==2){return true;}
        if(n%2==0){return false;}
        
        for(int i =3; i*i<=n; i+=2){
            if(n%i==0){return false;}
        }
        return true;
    }
}