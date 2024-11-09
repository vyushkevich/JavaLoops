package com.javaloops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testInvalidNumber() {
        MultiplicationTable table = new MultiplicationTable();
        assertThrows(IllegalArgumentException.class, () -> table.generateTable(0));
        assertThrows(IllegalArgumentException.class, () -> table.generateTable(-1));
    }

    @Test
    public void testValidNumber() {
        MultiplicationTable table = new MultiplicationTable();
        String expected = "2 x 1 = 2\n2 x 2 = 4\n2 x 3 = 6\n2 x 4 = 8\n2 x 5 = 10\n2 x 6 = 12\n2 x 7 = 14\n2 x 8 = 16\n2 x 9 = 18\n2 x 10 = 20\n";
        assertEquals(expected, table.generateTable(2));
    }
}
