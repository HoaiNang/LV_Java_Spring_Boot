package com.bezkoder.springjwt.controllers;

public class PaymentRequest {
    private String amount;
    private String orderCode;
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getOrderCode() {
        return orderCode;
    }
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }
}
