package com.cg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dao.SessionDao;
import com.cg.spring.dto.ScheduledSessions;

@Service("sessionservice")
@Transactional
public class SessionServiceImpl implements SessionService{
	    @Autowired
		SessionDao sessiondao;
	    
		@Override
		public List<ScheduledSessions> showAllSessions() {
			// TODO Auto-generated method stub
			return sessiondao.showAllSessions();
		}
		
		

}
