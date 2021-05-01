package tests.day_13;

import algorithms.day_13.OddOrEven;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class oddOrEvenTest {
    @Test
    public void exampleTest() {
        assertEquals("odd", OddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
    }

}