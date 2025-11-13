package com.example.paymentservice.PaymentGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayStrategyChooser {

    @Autowired
    private RazorPayPaymentGateway razorPayPaymentGateway;

//    @Autowired
//    private StripePaymentGateway stripePaymentGateway;


    public PaymentGateway getBestPaymentGateway(){
        return razorPayPaymentGateway;
    }

}
