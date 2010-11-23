package com.test.trading;

import org.springframework.stereotype.Component;

@Component
public class Trader {

	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void fail() throws Exception {
		throw new Exception("failed!");
	}

}
