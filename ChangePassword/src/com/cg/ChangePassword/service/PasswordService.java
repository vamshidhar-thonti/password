package com.cg.ChangePassword.service;

import com.cg.ChangePassword.exception.PasswordException;

public interface PasswordService {
	
	public void changePassword(String username, String newPassword, String oldPassword) throws PasswordException;
}
