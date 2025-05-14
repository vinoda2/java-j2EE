package in.xworkz.payment.dto;

import in.xworkz.payment.constant.PaymentMode;
import lombok.*;

import java.time.LocalDateTime;
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Setter
@Getter
public class PaymentDetailsDto {

    private int id;
    private LocalDateTime transactionTime;
    private PaymentMode paymentMode;
    private double transactionAmount;
    private String name;




}
