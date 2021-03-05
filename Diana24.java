import java.util.Arrays;

public class Diana24 {
    public int[][] method(int[][] arr, int n){

        int[] temp = new int[n*n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                temp[k++] = arr[i][j];
            }
        }
        Arrays.sort(temp);

        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = temp[k++];
            }
        }

//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        return arr;
    }
}
