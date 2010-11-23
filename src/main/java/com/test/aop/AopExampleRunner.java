package com.test.aop;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.trading.CorrectWay;
import com.test.trading.Trader;

@Component
public class AopExampleRunner {

	private static final Log log = LogFactory.getLog(AopExampleRunner.class);
	
	@Autowired
	private Trader trader;
	
	@Autowired
	private CorrectWay correct;
	
	@PostConstruct
	public void run() {
		
		trader.setId(100);
		trader.setName("John Doe");
		
		trader.getId();
		trader.getName();

		try {
			trader.fail();
		} catch (Exception e) {}
		
		correct.doSomethingRight();
		
		log.info("Usage count: " + ((UsageTracked) trader).getUsageCount());
		
	}
	
}
