package in.xworkz.payment.runner;

import in.xworkz.payment.dto.PaymentDetailsDto;
import in.xworkz.payment.exception.NumberException;
import in.xworkz.payment.service.PaymentService;

public class Runner {

    public static void main(String[] args) {


        String productName = "Laptop";
        try {
            System.out.println("================try block 1==============");
            System.out.println(productName.charAt(7));
            System.out.println("================try block 2==============");

        }catch(Throwable e){
            System.out.println("================catch block==============");
            e.printStackTrace();
        }

    }

    // list the 50 exception and handle it in different classes
}
