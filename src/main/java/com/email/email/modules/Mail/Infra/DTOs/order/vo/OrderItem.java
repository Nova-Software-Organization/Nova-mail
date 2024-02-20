package com.email.email.modules.Mail.Infra.DTOs.order.vo;

import lombok.Data;

@Data
public class OrderItem {
    private String productName;
    private int quantity;
    private double price;
}
