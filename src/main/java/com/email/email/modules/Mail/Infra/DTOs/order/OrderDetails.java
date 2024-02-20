package com.email.email.modules.Mail.Infra.DTOs.order;

import com.email.email.modules.Mail.Infra.DTOs.order.vo.OrderItem;

import lombok.Data;

@Data
public class OrderDetails {
    private OrderItem orderItem;
}
