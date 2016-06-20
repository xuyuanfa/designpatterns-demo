package com.xxx.designpatterns.strategy.one;

public class Context {
	private IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void execute() {
		strategy.doSomething();
	}
}