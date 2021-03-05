import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class Diana1Test {

    @Test
    public void method() throws NumberFormatException{
        Diana1 di = new Diana1();
        int[][] arr = {
                {1, 2, 3},
                {4, 5 ,6},
                {7, 8, 9}
        };
        int n = di.method(arr);

        int result = 9;
        assertEquals(result, n);
    }
}