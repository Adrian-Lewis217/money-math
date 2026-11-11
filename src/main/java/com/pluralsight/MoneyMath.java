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

        while(loop < 10){
            initialFloat = (float) (initialFloat + tencent);
            initialDouble += tencent;
            initialBD = initialBD.add(BigDecimal.valueOf(tencent));

            // print each variable
            System.out.println((loop + 1) + ".");
            System.out.println("Value of Float: " + initialFloat);
            System.out.println("Value of Double: " + initialDouble);
            System.out.println("Value of BigDecimal: " + initialBD);
            System.out.println("---------------------------");

            loop += 1;
        }

        System.out.println();
        System.out.println("-----------");
        System.out.println("New Loop");
        System.out.println("-----------");
        // reset values
        initialFloat = 0;
        initialDouble = 0.00;
        initialBD = BigDecimal.ZERO;
        double price = 19.99;
        loop = 0;

        // Print initial values
        System.out.println();
        System.out.println("Value of Float: " + initialFloat);
        System.out.println("Value of Double: " + initialDouble);
        System.out.println("Value of BigDecimal: " + initialBD);
        System.out.println();

        while(loop < 1000){
            initialFloat = (float) (initialFloat + price);
            initialDouble += price;
            initialBD = initialBD.add(BigDecimal.valueOf(price));

            // print each variable on one line
            System.out.println((loop + 1) + ". " + "Float:" + initialFloat + " - Double:" + initialDouble +" - BigDecimal:" + initialBD);
            System.out.println("-------------------------------------------------------------------------");

            loop += 1;
        }

    }
}
