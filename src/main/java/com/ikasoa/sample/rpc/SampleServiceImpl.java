package com.ikasoa.sample.rpc;

public class SampleServiceImpl implements SampleService {
	@Override
	public SampleVO findVO(int id) {
		return new SampleVO(id, "helloworld");
	}
}
