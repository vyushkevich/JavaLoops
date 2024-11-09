package com.javaloops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    // Тест для проверки правильности умножения
    @Test
    public void testMultiplication() {
        MultiplicationTable table = new MultiplicationTable();
        // Проверяем умножение 2 на 5
        assertEquals(10, table.multiply(2, 5));
        // Проверяем умножение 3 на 7
        assertEquals(21, table.multiply(3, 7));
        // Проверяем умножение 1 на 10
        assertEquals(10, table.multiply(1, 10));
    }

    // Тест для проверки выводов таблицы умножения
    @Test
    public void testGenerateTable() {
        MultiplicationTable table = new MultiplicationTable();
        String expected = "5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n5 x 5 = 25\n5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 40\n5 x 9 = 45\n5 x 10 = 50\n";
        assertEquals(expected, table.generateTable(5));
    }

    // Тест для проверки метода генерации таблицы умножения для некорректного числа (например, меньше 1)
    @Test
    public void testGenerateTableInvalidNumber() {
        MultiplicationTable table = new MultiplicationTable();
        assertThrows(IllegalArgumentException.class, () -> table.generateTable(0));
        assertThrows(IllegalArgumentException.class, () -> table.generateTable(-3));
    }

    // Тест для проверки корректности вывода результата для большого числа
    @Test
    public void testLargeMultiplication() {
        MultiplicationTable table = new MultiplicationTable();
        // Проверка умножения 100 на 10
        assertEquals(1000, table.multiply(100, 10));
    }
}
