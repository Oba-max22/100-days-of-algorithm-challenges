package tests.day_3;

import algorithms.day_3.Persist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersistTest {
    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        Assertions.assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }
}