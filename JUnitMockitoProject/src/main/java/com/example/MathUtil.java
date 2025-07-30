package com.example;

public class MathUtil {
    public static int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divide by zero");
        return a / b;
    }
}
