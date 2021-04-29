package Tests.day_11;

import algorithms.day_11.CalculateBMI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateBMITest {
    @Test
    public void testBMI() {
        assertEquals("Normal", CalculateBMI.bmi(80, 1.80));
    }

}