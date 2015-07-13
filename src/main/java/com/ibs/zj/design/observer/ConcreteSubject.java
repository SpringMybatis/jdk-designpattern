package com.ibs.zj.design.observer;

public class ConcreteSubject extends Subject {

	private String states;

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
		
	}
	// 更新调用方法
	public void changeStates(){
		this.notifyObersers(states);
	}
	
}
