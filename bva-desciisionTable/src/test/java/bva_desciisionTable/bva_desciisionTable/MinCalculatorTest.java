package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorTest {

    private final int A = 50;
    private final int C = 50;
    private final int D = 50;
    private final int E = 50;

    @Test
    void testBIsZero_shouldThrowException() {
        int b = 0;   // B min-1 (לא חוקי)

        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(A, b, C, D, E);
        });
    }

    @Test
    void testBIsOne_shouldReturnOne() {
        int b = 1;   // B min

        int result = MinCalculator.findMin(A, b, C, D, E);

        assertEquals(1, result);
    }

    @Test
    void testBIsTwo_shouldReturnTwo() {
        int b = 2;   // B min+1

        int result = MinCalculator.findMin(A, b, C, D, E);

        assertEquals(2, result);
    }

    @Test
    void testBNominal_shouldReturn50() {
        int b = 50;  // nominal

        int result = MinCalculator.findMin(A, b, C, D, E);

        assertEquals(50, result);
    }

    @Test
    void testBIs999_shouldReturn50() {
        int b = 999; // B max-1

        int result = MinCalculator.findMin(A, b, C, D, E);

        assertEquals(50, result);
    }

    @Test
    void testBIs1000_shouldReturn50() {
        int b = 1000; // B max

        int result = MinCalculator.findMin(A, b, C, D, E);

        assertEquals(50, result);
    }

    @Test
    void testBIs1001_shouldThrowException() {
        int b = 1001; // B max+1 (לא חוקי)

        assertThrows(IllegalArgumentException.class, () -> {
            MinCalculator.findMin(A, b, C, D, E);
        });
    }
}
