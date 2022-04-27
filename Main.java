package com.company;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Введите основание: ");
        int a = in.nextInt();
        System.out.print("Введите сверхстепень: ");
        int b = in.nextInt();
        System.out.print("Введите степень: ");
        int c = in.nextInt();
        System.out.println(getHighDegree(a, b, c));

    }

    public static BigDecimal getHighDegree(int a, int b, double c) {
        int degree = (int) c;
        double out = 0;
        if (b == 1) {
            return BigDecimal.valueOf((int)Math.pow(a, c));
        }
        if (b == 0) {
            return BigDecimal.valueOf(a);
        }

        if (b > 1) {
            for (int i = 1; i < b; i++) {
                out = Math.pow(c, degree);
            }
            double result = Math.pow(a, out);
            BigDecimal j = BigDecimal.valueOf(result);
            return j;
        }
        return null;
    }
}
