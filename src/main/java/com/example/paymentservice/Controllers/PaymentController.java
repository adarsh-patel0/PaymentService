package com.example.paymentservice.Controllers;

import com.example.paymentservice.Dto.InitiatePaymentDto;
import com.example.paymentservice.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentDto initiatePaymentDto){
        return paymentService.initiatePayment(initiatePaymentDto.getOrderId(),initiatePaymentDto.getEmail(),initiatePaymentDto.getPhoneNumber(),initiatePaymentDto.getAmount());
    }
}
