import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String str = new Scanner(System.in).next();
        char[] c = str.toCharArray();
        
        char[] alphabet = {'a', 'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        int[] arr = new int[26];
        for(int i =0; i<26; i++){
            arr[i] = -1;
        }
        
        for(int i =0; i<c.length; i++){
            for(int j = 0; j<26; j++){
                if(c[i] == alphabet[j] && arr[j] == -1){
                    arr[j] = i;
                }
            }
        }
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}