package com.ibs.zj.design.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class GlobalTimes extends NewspaperOffice implements Observer {

	public GlobalTimes(Observable obser) {
		this.observable = obser;
		this.things = "GlobalTimes's Daily brings you the latest news!";
		this.observable.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof SpecialRepoter) {
			System.out.println(arg+","+this.things);
		}
	}

	public void remove() {
		observable.deleteObserver(this);
	}

}
