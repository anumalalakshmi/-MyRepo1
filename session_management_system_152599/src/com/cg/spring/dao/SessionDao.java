package com.cg.spring.dao;

import java.util.List;

import com.cg.spring.dto.ScheduledSessions;

public interface SessionDao {
	public List<ScheduledSessions> showAllSessions();

}
