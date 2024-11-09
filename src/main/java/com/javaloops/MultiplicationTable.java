package com.javaloops;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    // Method to generate multiplication table as a list of strings
    public static List<String> generateMultiplicationTable(int n) {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            // Store the current line of the multiplication table
            table.add(n + " x " + i + " = " + result);
        }
        return table;
    }

    public static void main(String[] args) {
        int n = 5; // You can change this value or get it as user input
        List<String> table = generateMultiplicationTable(n);
        for (String line : table) {
            System.out.println(line);
        }
    }
}
