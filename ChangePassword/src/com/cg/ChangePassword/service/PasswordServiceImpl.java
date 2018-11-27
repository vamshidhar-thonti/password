package com.cg.ChangePassword.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.ChangePassword.dao.ChangePasswordDao;
import com.cg.ChangePassword.dto.ChangePasswordDto;
import com.cg.ChangePassword.exception.PasswordException;

@Service("Service")
@Transactional
public class PasswordServiceImpl implements PasswordService {

	@Autowired
	ChangePasswordDao dao;
	
	@Override
	public void changePassword(String username, String newPassword, String oldPassword) throws PasswordException {
		// TODO Auto-generated method stub
		ChangePasswordDto dto = dao.getDetails(username);
//		System.out.println(dto);
//		System.out.println(username);
//		System.out.println(newPassword);
//		System.out.println(oldPassword);
		if(oldPassword.equals(dto.getPassword())) {
			dao.setDetails(newPassword);
		}
		else
			throw new PasswordException("Old password didn't match!!!");
	}

}
