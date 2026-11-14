package com.pluralsight;

import java.math.BigDecimal;

public class MoneyMath {
    public static void main(String[] args) {
        float initialFloat = 0;
        double initialDouble = 0.00;
        BigDecimal initialBD = BigDecimal.ZERO;
        double tencent = 0.10;
        float tenth = 0.10f;
        int loop = 0;

        // Print initial values
        System.out.println("Value of Float: " + initialFloat);
        System.out.println("Value of Double: " + initialDouble);
        System.out.println("Value of BigDecimal: " + initialBD);

        while(loop < 10){
            initialFloat += tenth;
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
        float floatPrice = 19.99f;
        loop = 0;

        // Print initial values
        System.out.println();
        System.out.println("Value of Float: " + initialFloat);
        System.out.println("Value of Double: " + initialDouble);
        System.out.println("Value of BigDecimal: " + initialBD);
        System.out.println();

        while(loop < 1000){
            initialFloat += floatPrice;
            initialDouble += price;
            initialBD = initialBD.add(BigDecimal.valueOf(price));

            // print each variable on one line
            System.out.println((loop + 1) + ". " + "Float:" + initialFloat + " - Double:" + initialDouble +" - BigDecimal:" + initialBD);
            System.out.println("-------------------------------------------------------------------------");

            loop += 1;
        }
        /*
        * Questions
        *
        * 1. How many cents is the float off after 1000 iterations?
        * 2. Why does the BigDecimal print 1.00 and not 1?
        * 3. What happens if you call .add(); without assigning the result back to your variable?
        *
        * Answers
        * 1. 18 cents (18.4)
        * 2. BigDecimal remember the number of decimal place so it will keep in the same format
        * 3. It will stay do the work, just will throw the memory away because it was not saved or update the value of initialBD in the loop
        */
    }
}
