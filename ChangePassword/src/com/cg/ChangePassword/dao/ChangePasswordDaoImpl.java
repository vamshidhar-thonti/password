package com.cg.ChangePassword.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.ChangePassword.dto.ChangePasswordDto;
import com.cg.ChangePassword.exception.PasswordException;

@Repository("dao")
public class ChangePasswordDaoImpl implements ChangePasswordDao {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void setDetails(String newPassword) {
		// TODO Auto-generated method stub
		ChangePasswordDto dto = new ChangePasswordDto();
		dto.setPassword(newPassword);
		em.persist(dto);
		em.flush();
	}

	@Override
	public ChangePasswordDto getDetails(String username) throws PasswordException {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from ChangePasswordDto");
//		query.setParameter("name", username);
//		ChangePasswordDto dto = (ChangePasswordDto) query.getSingleResult();
//		System.out.println(dto);
		List<ChangePasswordDto> dto = query.getResultList();
//		for(ChangePasswordDto d : dto)
//			System.out.println(d);
//		ChangePasswordDto dto = em.find(ChangePasswordDto.class, username);
//		System.out.println(dto);
		if(dto == null)
			throw new PasswordException("Username does not exist!!!");
		return null;
	}

}
