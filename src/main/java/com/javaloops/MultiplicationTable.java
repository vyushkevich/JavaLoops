package com.javaloops;

public class MultiplicationTable {

    // Method to print the multiplication table for a given number 'n'
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            // Print the current line of the multiplication table
            System.out.println(n + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        int n = 5; // You can change this value or get it as user input
        printMultiplicationTable(n);
    }
}

