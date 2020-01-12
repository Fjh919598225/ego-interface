package com.sxt.service;

import java.util.List;

import com.sxt.domain.UserAddress;

public interface OrderService {
	
	public List<UserAddress> initOrder(String userId);

}

