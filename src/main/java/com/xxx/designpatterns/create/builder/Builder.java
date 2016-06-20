package com.xxx.designpatterns.create.builder;

public interface Builder {
	public void buildPart1();

	public void buildPart2();

	public Product retrieveResult();
}
