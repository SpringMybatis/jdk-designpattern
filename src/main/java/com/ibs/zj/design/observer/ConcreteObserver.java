package com.ibs.zj.design.observer;

public class ConcreteObserver implements Observer {

	/**
	 * 观察者名称
	 * 
	 */
	private String observerName;

	/**
	 * 观察者描述
	 * 
	 */
	private String observerSay;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibs.zj.design.observer.Observer#update(java.lang.String)
	 */
	public void update(String state) {
		System.out.println(state + "，" + observerName + "说:“" + observerSay + "”。");
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getObserverSay() {
		return observerSay;
	}

	public void setObserverSay(String observerSay) {
		this.observerSay = observerSay;
	}

}
