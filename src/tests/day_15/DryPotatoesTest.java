package tests.day_15;

import algorithms.day_15.DryPotatoes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DryPotatoesTest {
    private static void dotest(int p0, int w0, int p1, int expected) {
        assertEquals(expected, DryPotatoes.potatoes(p0, w0, p1));
    }

    @Test
    public void test() {
        dotest(82, 127, 80, 114);
        dotest(93, 129, 91, 100);
    }

}