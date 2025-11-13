package com.example.paymentservice.Service;

import com.example.paymentservice.PaymentGateway.PaymentGateway;
import com.example.paymentservice.PaymentGateway.PaymentGatewayStrategyChooser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentGatewayStrategyChooser paymentGatewayStrategyChooser;


    public String initiatePayment(String orderId, String email, String phoneNumber, Long amount){
        PaymentGateway paymentGateway = paymentGatewayStrategyChooser.getBestPaymentGateway();
        return paymentGateway.generatePaymentLink(orderId, email, phoneNumber, amount);
    }
}
