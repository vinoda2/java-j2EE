package in.xworkz.payment.repository;

import in.xworkz.payment.dto.PaymentDetailsDto;

public interface PaymentRepository {

    boolean savePaymentDetails(PaymentDetailsDto sto);
}
