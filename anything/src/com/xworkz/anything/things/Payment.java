package com.xworkz.anything.things;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Payment {

    public static String paymentFrom;
    public static String paymentTo;
    public static double amount;
    public static LocalDate transactionDate;
    public static LocalTime transactionTime;

    // 4 ways to declare the methods
    //1. methodout without returntype and without paramater

    public static void displayPaymentInformation(){
        paymentFrom = "XYZ";
        paymentTo = "ABC";
        amount = 1000;
        transactionDate = LocalDate.now();
        transactionTime = LocalTime.now();
        System.out.println("payment from:"+paymentFrom);
        System.out.println("payment to:"+paymentTo);
        System.out.println("amount:"+amount);
        System.out.println("transaction Date:"+transactionDate);
        System.out.println("transaction Time:"+transactionTime);

    }

    //2 way, method without return type and with parameters
    public static void displayPaymentAmount(double paidAmount){
        System.out.println("paid amoint is :"+paidAmount);
    }

    //
    public static void displayTransactionDetails(double paidAmount, LocalDateTime paymentDoneOn){
        System.out.println("paid amount is:"+amount);
        System.out.println("Payment Done on:"+paymentDoneOn);
    }



}
