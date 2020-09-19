package com.fubon.testapp.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fubon.testapp.service.RoleService;

@Component
public class TestSchedule {
	
	private static final Logger log = LogManager.getLogger(TestSchedule.class);
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Autowired
	RoleService roleService;

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		//log.info("The time is now {}", dateFormat.format(new Date()));
		//log.info("Size: "+roleService.read().size());
	}
	
}
