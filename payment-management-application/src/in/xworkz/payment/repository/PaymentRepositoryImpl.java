package in.xworkz.payment.repository;

import in.xworkz.payment.dto.PaymentDetailsDto;

public class PaymentRepositoryImpl implements PaymentRepository{
    @Override
    public boolean savePaymentDetails(PaymentDetailsDto dto) {
        System.out.println("PaymentRepository implementation ");
        System.out.println("dto:"+dto);
        return true;
    }
}
