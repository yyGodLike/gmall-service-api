package com.atguigu.order;

import java.util.List;

import com.atguigu.bean.UserAddressVO;

public interface IOrderService {
	
	public List<UserAddressVO> doCreateOrder(Integer userId);
}
