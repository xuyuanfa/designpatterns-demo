package com.xxx.designpatterns.mediator;

class ColleagueB extends AbstractColleague {

	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.BaffectA();
	}
}