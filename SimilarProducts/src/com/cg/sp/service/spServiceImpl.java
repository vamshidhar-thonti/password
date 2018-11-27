package com.cg.sp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.sp.DAO.spDAO;
import com.cg.sp.dto.Category;

@Service("service")
@Transactional
public class spServiceImpl implements spService {
	
	@Autowired
	spDAO dao;
	
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
