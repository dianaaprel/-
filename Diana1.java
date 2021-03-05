public class Diana1 {
    public int method(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > sum) {
                    sum = arr[i][j];
                }
            }
        }
        return sum;
    }

}
