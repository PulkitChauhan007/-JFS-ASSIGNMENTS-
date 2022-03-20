package workjunit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class junitQ1Test {

    @Test
    void findMinMax() {
        assertAll(
                () -> assertArrayEquals(new int[]{0, 34}, junitQ1.findMinMax(new int[]{0, 1, 2, 34, 5, 6})),
                () -> assertArrayEquals(new int[]{1, 10}, junitQ1.findMinMax(new int[]{1, 2, 10, 5, 6})),
                () -> assertArrayEquals(new int[]{2, 100}, junitQ1.findMinMax(new int[]{ 100, 2, 34, 5, 6})));
    }

    @Test
    void findMinMax2() {
        assertAll(
                () -> assertEquals("Min is 0 Max is 34", junitQ1.findMinMax2(new int[]{0, 1, 2, 34, 5, 6})),
                () -> assertEquals("Min is 1 Max is 10", junitQ1.findMinMax2(new int[]{1, 2, 10, 5, 6})),
                () -> assertEquals("Min is 2 Max is 100", junitQ1.findMinMax2(new int[]{ 100, 2, 34, 5, 6})));
    }
}