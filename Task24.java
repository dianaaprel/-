import java.util.Arrays;
import java.util.Scanner;


public class Task24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число n");
        int n = in.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        Diana24 di24 = new Diana24();
        di24.method(arr, n);
    }
}
