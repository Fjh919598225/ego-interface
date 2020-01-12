package com.sxt.service;

import java.util.List;

import com.sxt.domain.UserAddress;

public interface UserService {
	
	/**
	 * 查询用户所有的地址
	 */
	public List<UserAddress> queryAllAddress(String userId);

}
