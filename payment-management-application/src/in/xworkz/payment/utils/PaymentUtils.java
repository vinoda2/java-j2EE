package in.xworkz.payment.utils;

import in.xworkz.payment.constant.PaymentMode;
import in.xworkz.payment.dto.PaymentDetailsDto;

import java.time.LocalDateTime;

public class PaymentUtils {

    private PaymentUtils(){

    }
    public static void checkPaymentMode(PaymentDetailsDto dto) {
        if(dto.getPaymentMode() == PaymentMode.CASH){
            dto.setTransactionTime(LocalDateTime.now().plusDays(1));
        }
    }

    public static boolean validateName(String name){
        if(name!=null && name.length()>=3){
            System.out.println("Correct name");
            return true;
        }
        return  false;
    }

}
