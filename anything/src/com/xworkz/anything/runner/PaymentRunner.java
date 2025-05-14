package com.xworkz.anything.runner;

import com.xworkz.anything.things.Payment;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Iterator;

public class PaymentRunner {
    public static void main(String[] args)  {
        System.out.println("Payment details are......");
        try{
            doPayment();
        }catch (PaymentException e){
            e.printStackTrace();

        }
    }

    public static void doPayment() throws PaymentException{
        throw  new PaymentException("Payment failed due to network issue");
    }
}
