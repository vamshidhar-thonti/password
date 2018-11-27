package com.cg.ChangePassword.dao;

import com.cg.ChangePassword.dto.ChangePasswordDto;
import com.cg.ChangePassword.exception.PasswordException;

public interface ChangePasswordDao {
	
	public void setDetails(String newPassword);
	public ChangePasswordDto getDetails(String username) throws PasswordException;

}
