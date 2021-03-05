import org.junit.Test;

import static org.junit.Assert.*;

public class Diana24Test {

    @Test
    public void method() {
        Diana24 di = new Diana24();
        int n = 3;
        int[][] arr = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] diana = di.method(arr, n);

        int[][] result = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        assertEquals(result, diana);
    }
}