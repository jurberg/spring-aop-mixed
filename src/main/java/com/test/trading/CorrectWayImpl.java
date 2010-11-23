package com.test.trading;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("correctWay")
public class CorrectWayImpl implements CorrectWay {

	private static final Log log = LogFactory.getLog(CorrectWayImpl.class);

	@Override
	public void doSomethingRight() {
		log.info("in doSomethingRight()");
	}

}
