package com.cg.sp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.sp.dto.Category;

@Repository("dao")
public class spDAOImpl implements spDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		Query q = em.createQuery("from Category");
		List<Category> list = q.getResultList();
		for(Category c : list)
			System.out.println(c);
		return list;
	}

}
