//package Лаб1А;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: n и m");
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
            }
        }
        Diana1 di1 = new Diana1();

        System.out.println(di1.method(arr));
    }
}