package ru.mirea.test;


import java.math.BigDecimal;
import java.math.BigInteger;

public class Calculator {

    public static double add(double a, double b) {
        return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b)).doubleValue();
    }

    public static int add(int a, int b) {
        return a+b;
    }


    public static double subtr(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b ;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("divide by 0");
        }
        return a/b;
    }

    public static int fact(int a) {
        if (a < 0) {
            throw new ArithmeticException("Number < 0");
        }
        int result = 1;
        for (int i = 2; i <= a; i++)
            result = result * i;
        return result;
    }

    public static BigInteger factBig(int a) {
        if (a < 0) {
            throw new ArithmeticException("Number < 0");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= a; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
