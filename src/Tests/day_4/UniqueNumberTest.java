package Tests.day_4;

import org.junit.jupiter.api.Test;

import static algorithms.day_4.UniqueNumber.findUniq;
import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberTest {
    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
}