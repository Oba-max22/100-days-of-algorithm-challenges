package tests.day_8;

import algorithms.day_8.NumbersWithDigitInsideAlgo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersWithDigitInsideAlgoTest {
    @Test
    public void BasicTests() {
        assertArrayEquals(new long[] { 0, 0, 0 }, NumbersWithDigitInsideAlgo.NumbersWithDigitInside(5, 6));
        assertArrayEquals(new long[] { 1, 6, 6 }, NumbersWithDigitInsideAlgo.NumbersWithDigitInside(7, 6));
        assertArrayEquals(new long[] { 3, 22, 110 }, NumbersWithDigitInsideAlgo.NumbersWithDigitInside(11, 1));
        assertArrayEquals(new long[] { 2, 30, 200 }, NumbersWithDigitInsideAlgo.NumbersWithDigitInside(20, 0));
        assertArrayEquals(new long[] { 9, 286, 5955146588160L }, NumbersWithDigitInsideAlgo.NumbersWithDigitInside(44, 4));
    }
}