package com.javaloops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class MultiplicationTableTest {

    @Test
    public void testMultiplicationTableForFive() {
        List<String> result = MultiplicationTable.generateMultiplicationTable(5);

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("5 x 1 = 5");
        expectedOutput.add("5 x 2 = 10");
        expectedOutput.add("5 x 3 = 15");
        expectedOutput.add("5 x 4 = 20");
        expectedOutput.add("5 x 5 = 25");
        expectedOutput.add("5 x 6 = 30");
        expectedOutput.add("5 x 7 = 35");
        expectedOutput.add("5 x 8 = 40");
        expectedOutput.add("5 x 9 = 45");
        expectedOutput.add("5 x 10 = 50");

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testMultiplicationTableForOne() {
        List<String> result = MultiplicationTable.generateMultiplicationTable(1);

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("1 x 1 = 1");
        expectedOutput.add("1 x 2 = 2");
        expectedOutput.add("1 x 3 = 3");
        expectedOutput.add("1 x 4 = 4");
        expectedOutput.add("1 x 5 = 5");
        expectedOutput.add("1 x 6 = 6");
        expectedOutput.add("1 x 7 = 7");
        expectedOutput.add("1 x 8 = 8");
        expectedOutput.add("1 x 9 = 9");
        expectedOutput.add("1 x 10 = 10");

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testMultiplicationTableForTen() {
        List<String> result = MultiplicationTable.generateMultiplicationTable(10);

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("10 x 1 = 10");
        expectedOutput.add("10 x 2 = 20");
        expectedOutput.add("10 x 3 = 30");
        expectedOutput.add("10 x 4 = 40");
        expectedOutput.add("10 x 5 = 50");
        expectedOutput.add("10 x 6 = 60");
        expectedOutput.add("10 x 7 = 70");
        expectedOutput.add("10 x 8 = 80");
        expectedOutput.add("10 x 9 = 90");
        expectedOutput.add("10 x 10 = 100");

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testMultiplicationTableForZero() {
        List<String> result = MultiplicationTable.generateMultiplicationTable(0);

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("0 x 1 = 0");
        expectedOutput.add("0 x 2 = 0");
        expectedOutput.add("0 x 3 = 0");
        expectedOutput.add("0 x 4 = 0");
        expectedOutput.add("0 x 5 = 0");
        expectedOutput.add("0 x 6 = 0");
        expectedOutput.add("0 x 7 = 0");
        expectedOutput.add("0 x 8 = 0");
        expectedOutput.add("0 x 9 = 0");
        expectedOutput.add("0 x 10 = 0");

        assertEquals(expectedOutput, result);
    }
}
