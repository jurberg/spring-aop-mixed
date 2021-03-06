package com.test.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class IntroductionExampleAspect {

	private static final Log log = LogFactory.getLog(IntroductionExampleAspect.class);

	@DeclareParents(value="com.test.trading.*", defaultImpl=DefaultUsageTracked.class)
	public static UsageTracked mixin;
	
	@Before("execution(* com.test.trading.*.*(..)) && this(usageTracked)")
	public void recordUsage(UsageTracked usageTracked) {
		usageTracked.incrementUsageCount();
		log.info("incremented usage count");
	}
	
}
