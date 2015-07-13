package com.ibs.zj.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhongjun
 * 
 * 目标对象
 */
public abstract class Subject {

	/**
	 * 观察者集合
	 */
	List<Observer> list = new ArrayList<Observer>();
	
	/**
	 * 添加观察者
	 * 
	 * @param observer
	 */
	public void attachObserver(Observer observer){
		list.add(observer);
	}
	
	/**
	 * 移除观察者
	 * 
	 * @param observer
	 */
	public void deleteObserver(Observer observer){
		list.remove(observer);
	}
	
	
	/**
	 * 通知所有观察者更新
	 * 
	 * @param states
	 */
	public void notifyObersers(String states){
		for(Observer ober:list){
			ober.update(states);
		}
	}
	
}
