package com.ibs.zj.design.observer.jdk;

import java.util.Observable;

/**
 * @author zhongjun 目标对象
 */
public class SpecialRepoter extends Observable {

	private String msg;

	/**
	 * 获取最新的消息
	 * 
	 * @param msg
	 */
	public void getNewNewz(String msg) {
		// 通知状态改变
		this.setChanged();
		// 通知所有观察者
		this.notifyObservers(msg);
		// 清楚状态
		this.clearChanged();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
