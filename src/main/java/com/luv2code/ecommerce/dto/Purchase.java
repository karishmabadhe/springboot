package com.luv2code.ecommerce.dto;

import java.util.Set;

import com.luv2code.ecommerce.entity.Address;
import com.luv2code.ecommerce.entity.Customer;
import com.luv2code.ecommerce.entity.Order;
import com.luv2code.ecommerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {
	
	private Customer customer;
	private Address billingAddress;
	private Address shippingAddress;
	private Order order;
	private Set<OrderItem> orderItems;
}
