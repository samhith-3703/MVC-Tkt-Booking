package com.var.service;

import com.var.dto.request.PaymentRequest;
import com.var.dto.response.PaymentResponse;

import java.util.List;

public interface PaymentService {
    PaymentResponse addPayment(PaymentRequest request);
    PaymentResponse getPaymentById(int paymentId);
    PaymentResponse getPaymentByBooking(int bookingId);
    List<PaymentResponse> getPaymentsByUser(int userId);
}
