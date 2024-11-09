package com.javaloops;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number to display the multiplication table: ");
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
