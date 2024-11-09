package com.javaloops;

public class MultiplicationTable {

 
    public int multiply(int a, int b) {
        return a * b;
    }

  
    public String generateTable(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Number must be greater than 0.");
        }
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            table.append(n)
                 .append(" x ")
                 .append(i)
                 .append(" = ")
                 .append(n * i)
                 .append("\n");
        }
        return table.toString();
    }
}
