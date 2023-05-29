package com.kaijoma.ecommerce.dto;

import com.kaijoma.ecommerce.entity.Address;
import com.kaijoma.ecommerce.entity.Customer;
import com.kaijoma.ecommerce.entity.Order;
import com.kaijoma.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
