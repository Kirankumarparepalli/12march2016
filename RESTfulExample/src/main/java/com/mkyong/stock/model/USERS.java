package com.mkyong.stock.model;

import java.io.Serializable;

public class USERS implements Serializable {

	private static final long serialVersionUID = 1L;

	private int sno;
	private String name;
	public int getSno() {
		return sno;
	}
	public void setSno(int i) {
		this.sno = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//getter and setter methods...
}