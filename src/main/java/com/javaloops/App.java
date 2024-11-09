package com.javaloops;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число для вывода таблицы умножения: ");
            int n = scanner.nextInt();
            
            try {
                MultiplicationTable table = new MultiplicationTable();
                System.out.println(table.generateTable(n));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
