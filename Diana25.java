import java.util.ArrayList;

public class Diana25 {
    public int method(int[][] mat, int n){
        int principal = 0, secondary = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    principal += mat[i][j];
                if ((i + j) == (n - 1))
                    secondary += mat[i][j];
            }
        }

        int min = 0;

        if(principal > secondary){
            min = secondary;
        }else if(principal == secondary){
            min = secondary;
        }else{
            min = principal;
        }

        int sum_part1 = 0, sum_part2 = 0, sum_part3 = 0, sum_part4 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n - 1) {
                    if (i < j && i != j && i + j > 0)
                        sum_part1 += mat[i][j];
                    else if (i != j)
                        sum_part2 += mat[i][j];
                }
                else {
                    if (i > j && i + j != n - 1)
                        sum_part3 += mat[i][j];
                    else {
                        if (i + j != n - 1 && i != j)
                            sum_part4 += mat[i][j];
                    }
                }
            }
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(sum_part1);
        arr.add(sum_part2);
        arr.add(sum_part3);
        arr.add(sum_part4);

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > min){
                min = arr.get(i);
            }
        }

        return min;
    }
}
