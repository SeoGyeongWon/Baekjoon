import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = -1;
    int a = 0;
    int b = 0;
    int [][] matrix = new int[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        matrix[i][j] = sc.nextInt();
        if(matrix[i][j] > max) {
          max = matrix[i][j];
          a = i+1;
          b = j+1;
        }

      }
    }
    System.out.println(max);
    System.out.println(a + " " + b);
  }
}
