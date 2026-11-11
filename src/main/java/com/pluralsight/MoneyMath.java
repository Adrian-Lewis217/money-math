package com.pluralsight;

import java.math.BigDecimal;

public class MoneyMath {
    public static void main(String[] args) {
        float initialFloat = 0;
        double initialDouble = 0.00;
        BigDecimal initialBD = BigDecimal.ZERO;
        double tencent = 0.10;
        int loop = 0;

        // Print initial values
        System.out.println("Value of Float: " + initialFloat);
        System.out.println("Value of Double: " + initialDouble);
        System.out.println("Value of BigDecimal: " + initialBD);

        while(loop <= 10){
            initialFloat = (float) (initialFloat + tencent);
            initialDouble += tencent;
            initialBD = initialBD.add(BigDecimal.valueOf(tencent));

            // print each variables
            System.out.println("Value of Float: " + initialFloat);
            System.out.println("Value of Double: " + initialDouble);
            System.out.println("Value of BigDecimal: " + initialBD);

            loop += 1;
        }
        // reset values
        initialFloat = 0;
        initialDouble = 0.00;
        initialBD = BigDecimal.ZERO;
        double price = 19.99;
        loop = 0;

        // Print initial values
        System.out.println("Value of Float: " + initialFloat);
        System.out.println("Value of Double: " + initialDouble);
        System.out.println("Value of BigDecimal: " + initialBD);

        while(loop <= 10){
            initialFloat = (float) (initialFloat + tencent);
            initialDouble += tencent;
            initialBD = initialBD.add(BigDecimal.valueOf(tencent));

            // print each variables
            System.out.println("Value of Float: " + initialFloat);
            System.out.println("Value of Double: " + initialDouble);
            System.out.println("Value of BigDecimal: " + initialBD);

            loop += 1;
        }

    }
}
