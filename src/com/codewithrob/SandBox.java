package com.codewithrob;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

// L = Loan Amount
// c = Monthly Interest
// n = Number of Payments ( 10 years = 120 payments)
// p = Number of Payments Made

public class SandBox {
    public static void main(String[] args) {
        calculatePaymentSchedule();


    }

    public static void calculatePaymentSchedule() {
        final byte PERCENT = 100;
        final int annualInterest = 4;
        final byte years = 10;
        double L = 180_000;

        float c = (float) annualInterest / PERCENT / 12;
        int n = years * 12;
        int p = 1;
        float base = (1 + c);


        while (L > 0) {
            L = L * (((Math.pow(base, n)) - (Math.pow(base, p))) / ((Math.pow(base, n)) - 1));

            p++;
            System.out.println(L);
        }

//        System.out.println("L: " + L);
//        System.out.println("c: " + c);
//        System.out.println("n: " + n);
//        System.out.println("p: " + p);
//        System.out.println("base: " + base);






    }

}
