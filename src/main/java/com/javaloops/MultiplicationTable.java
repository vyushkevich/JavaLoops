package com.javaloops;

public class MultiplicationTable {

    public int multiply(int n, int i) {
        return n * i;
    }

    public String generateTable(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El número debe ser mayor que 0");
        }
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            table.append(n).append(" x ").append(i).append(" = ").append(multiply(n, i)).append("\n");
        }
        return table.toString();
    }
}

