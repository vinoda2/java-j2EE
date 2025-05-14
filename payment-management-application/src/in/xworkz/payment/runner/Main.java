package in.xworkz.payment.runner;

import in.xworkz.payment.constant.PaymentMode;
import in.xworkz.payment.dto.PaymentDetailsDto;
import in.xworkz.payment.repository.PaymentRepository;
import in.xworkz.payment.repository.PaymentRepositoryImpl;
import in.xworkz.payment.service.PaymentService;
import in.xworkz.payment.service.PaymentServiceImpl;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Payment management application started");
        //instance of paymentdetailsdto
        System.out.println("provide the values");
        PaymentDetailsDto paymentDetailsDto =    new PaymentDetailsDto();
        paymentDetailsDto.setId(1);
        paymentDetailsDto.setPaymentMode(PaymentMode.CASH);
        paymentDetailsDto.setTransactionAmount(10000);
        paymentDetailsDto.setTransactionTime(LocalDateTime.now());
        paymentDetailsDto.setName("Nayana");
        System.out.println("values assigned:"+paymentDetailsDto);

        PaymentRepository paymentRepository = new PaymentRepositoryImpl();
        PaymentService paymentService = new PaymentServiceImpl(paymentRepository);
       boolean result =  paymentService.validate(paymentDetailsDto);
        if(result!=true){
            System.out.println("Payment details  not saved");
        }else{
            System.out.println("Payment details saved");
        }


    }
}