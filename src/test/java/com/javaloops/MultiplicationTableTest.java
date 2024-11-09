package com.javaloops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    public void testMultiply() {
        MultiplicationTable table = new MultiplicationTable();
        assertEquals(10, table.multiply(2, 5));
        assertEquals(21, table.multiply(3, 7));
        assertEquals(10, table.multiply(1, 10));
    }

    @Test
    public void testGenerateTable() {
        MultiplicationTable table = new MultiplicationTable();
        String expected = "5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n5 x 5 = 25\n5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 40\n5 x 9 = 45\n5 x 10 = 50\n";
        assertEquals(expected, table.generateTable(5));
    }

    @Test
    public void testGenerateTableInvalidNumber() {
        MultiplicationTable table = new MultiplicationTable();
        assertThrows(IllegalArgumentException.class, () -> table.generateTable(0));
        assertThrows(IllegalArgumentException.class, () -> table.generateTable(-3));
    }
}
