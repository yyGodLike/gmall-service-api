package com.atguigu.user;

import java.util.List;

import com.atguigu.bean.UserAddressVO;

public interface IUserService {
	
	public List<UserAddressVO> getUserAddressByUserId(Integer userId);
	
}
