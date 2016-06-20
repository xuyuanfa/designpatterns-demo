package com.xxx.designpatterns.mediator;

public class ColleagueA extends AbstractColleague {

	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.AaffectB();
	}
}