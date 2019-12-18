package com.woniu.Dome4;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements IUserService{

	
	@Resource
	IUserDao ud;
	public void save(User user){
		System.out.println("UserServiceImpl.save()");
		ud.save(null);
	}
	

}
