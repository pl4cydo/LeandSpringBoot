package com.scheduling.tasks;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SheduledTasks {
    
    private static final Logger log = LoggerFactory.getLogger(SheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:MM:SS");

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		log.info("The time is now {}", dateFormat.format(new Date(0)));
	}

}
