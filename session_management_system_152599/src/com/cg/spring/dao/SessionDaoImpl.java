package com.cg.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.spring.dto.ScheduledSessions;

@Repository("sessiondao")

public class SessionDaoImpl implements SessionDao {
	@Autowired
	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	public List<ScheduledSessions> showAllSessions() {
		// TODO Auto-generated method stub
		List<ScheduledSessions> list = new ArrayList<>();
		Query query = entitymanager.createQuery("FROM ScheduledSessions");
		list = query.getResultList();
		return list;
	}
	

}
