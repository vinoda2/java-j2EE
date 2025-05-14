package in.xworkz.payment.service;

import in.xworkz.payment.dto.PaymentDetailsDto;

public interface PaymentService {

    boolean validate(PaymentDetailsDto dto);

}
