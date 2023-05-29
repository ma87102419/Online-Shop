package com.kaijoma.ecommerce.service;

import com.kaijoma.ecommerce.dto.PaymentInfo;
import com.kaijoma.ecommerce.dto.Purchase;
import com.kaijoma.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
