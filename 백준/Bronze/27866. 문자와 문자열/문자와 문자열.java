import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int n = sc.nextInt();

    int m = n-1;

    String[] arr = new String[s.length()];
    for(int i = 0; i<s.length(); i++){
      arr[i] = s.valueOf(s.charAt(i));
    }

    System.out.println(arr[m]);

    sc.close();
  }
}
