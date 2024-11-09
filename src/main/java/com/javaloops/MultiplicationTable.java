package com.javaloops;

public class MultiplicationTable {

    // Метод для умножения двух чисел
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Метод для генерации таблицы умножения для числа от 1 до 10
    public String generateTable(int number) {
        // Проверка на правильность введённого числа
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }

        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            // Форматируем строку таблицы умножения
            table.append(number)
                 .append(" x ")
                 .append(i)
                 .append(" = ")
                 .append(number * i)
                 .append("\n");
        }
        return table.toString();
    }
}
