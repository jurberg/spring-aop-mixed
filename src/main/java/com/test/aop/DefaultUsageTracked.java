package com.test.aop;

import java.util.concurrent.atomic.AtomicInteger;

public class DefaultUsageTracked implements UsageTracked {

	private AtomicInteger count = new AtomicInteger(0);
	
	@Override
	public int getUsageCount() {
		return count.get();
	}

	@Override
	public void incrementUsageCount() {
		count.incrementAndGet();
	}

}
