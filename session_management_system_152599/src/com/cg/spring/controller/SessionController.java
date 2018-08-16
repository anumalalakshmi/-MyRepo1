package com.cg.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.dto.ScheduledSessions;
import com.cg.spring.service.SessionService;

@Controller
public class SessionController {
	@Autowired
	SessionService sessionservice;

	@RequestMapping(value = "/showall", method = RequestMethod.GET)
	public ModelAndView showAllSessions(@ModelAttribute("session") ScheduledSessions session) {
		List<ScheduledSessions> sessionList = sessionservice.showAllSessions();
		return new ModelAndView("show", "sessiondata", sessionList);

	}

}
