package in.xworkz.payment.service;

import in.xworkz.payment.constant.PaymentMode;
import in.xworkz.payment.dto.PaymentDetailsDto;
import in.xworkz.payment.repository.PaymentRepository;
import in.xworkz.payment.utils.PaymentUtils;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService{

    private PaymentRepository paymentRepository;

    @Override
    public boolean validate(PaymentDetailsDto dto) {

        System.out.println("service class validate ()");
        //connect to repo
        if(dto!=null) {
            // validation
            // check the payment mode

            if (PaymentUtils.validateName(dto.getName())) {
                PaymentUtils.checkPaymentMode(dto);

                boolean saveResult = paymentRepository.savePaymentDetails(dto);
                return saveResult;
            }
        }
        return false;
    }


}
