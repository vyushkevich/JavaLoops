package com.javaloops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    public void testMultiplicationTableForFive() {
        // Capture output to verify against expected
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MultiplicationTable.printMultiplicationTable(5);

        // Expected output for the table of 5
        String expectedOutput = 
            "5 x 1 = 5\n" +
            "5 x 2 = 10\n" +
            "5 x 3 = 15\n" +
            "5 x 4 = 20\n" +
            "5 x 5 = 25\n" +
            "5 x 6 = 30\n" +
            "5 x 7 = 35\n" +
            "5 x 8 = 40\n" +
            "5 x 9 = 45\n" +
            "5 x 10 = 50";

        // Compare actual output with expected output
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }

    @Test
    public void testMultiplicationTableForOne() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MultiplicationTable.printMultiplicationTable(1);

        String expectedOutput = 
            "1 x 1 = 1\n" +
            "1 x 2 = 2\n" +
            "1 x 3 = 3\n" +
            "1 x 4 = 4\n" +
            "1 x 5 = 5\n" +
            "1 x 6 = 6\n" +
            "1 x 7 = 7\n" +
            "1 x 8 = 8\n" +
            "1 x 9 = 9\n" +
            "1 x 10 = 10";

        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }

    @Test
    public void testMultiplicationTableForTen() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MultiplicationTable.printMultiplicationTable(10);

        String expectedOutput = 
            "10 x 1 = 10\n" +
            "10 x 2 = 20\n" +
            "10 x 3 = 30\n" +
            "10 x 4 = 40\n" +
            "10 x 5 = 50\n" +
            "10 x 6 = 60\n" +
            "10 x 7 = 70\n" +
            "10 x 8 = 80\n" +
            "10 x 9 = 90\n" +
            "10 x 10 = 100";

        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }

    @Test
    public void testMultiplicationTableForZero() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MultiplicationTable.printMultiplicationTable(0);

        String expectedOutput = 
            "0 x 1 = 0\n" +
            "0 x 2 = 0\n" +
            "0 x 3 = 0\n" +
            "0 x 4 = 0\n" +
            "0 x 5 = 0\n" +
            "0 x 6 = 0\n" +
            "0 x 7 = 0\n" +
            "0 x 8 = 0\n" +
            "0 x 9 = 0\n" +
            "0 x 10 = 0";

        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }
}
