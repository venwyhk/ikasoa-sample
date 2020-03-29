package com.ikasoa.sample.rpc;

public class SampleVO {

	private int id;
	private String string;

	public SampleVO() {
	}

	public SampleVO(int id, String string) {
		this.id = id;
		this.string = string;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}