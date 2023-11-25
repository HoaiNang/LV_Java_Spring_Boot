package com.bezkoder.springjwt.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/vnpay")
public class VNPayController {

    @PostMapping("/create-payment")
    public String createPayment(@RequestBody PaymentRequest paymentRequest) {
        // Điền thông tin cần thiết như số tiền, mã đơn hàng, mã merchant, và các thông tin khác
        String amount = paymentRequest.getAmount();
        String orderCode = paymentRequest.getOrderCode();
        String merchantCode = "YOUR_MERCHANT_CODE";
        String secureSecret = "YOUR_SECURE_SECRET";
        
        // Tạo URL yêu cầu thanh toán tới VNPAY
        String returnUrl = "URL_TO_RETURN_AFTER_PAYMENT";

        String url = "https://sandbox.vnpayment.vn/paymentv2/vpcpay.html?merchant=" + merchantCode +
                     "&vnp_Amount=" + amount + "&vnp_OrderInfo=" + orderCode +
                     "&vnp_Returnurl=" + returnUrl + "&vnp_TmnCode=" + merchantCode;

        // Ký URL với mã bí mật
        String secureHash = SecureHash.generateSecureHash(merchantCode, amount, orderCode, returnUrl, secureSecret);

        url += "&vnp_SecureHash=" + secureHash;

        return url;
    }
}
