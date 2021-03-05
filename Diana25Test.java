import org.junit.Test;

import static org.junit.Assert.*;

public class Diana25Test {

    @Test
    public void method() {
        Diana25 di = new Diana25();
        int n = 3;
        int[][] arr = {
                {1, 21, 3},
                {20, 5, 64},
                {7, 80, 9}
        };

        int result = di.method(arr, n);
        int expected = 80;

        assertEquals(expected, result);
    }
}