package com.ibs.zj.design.observer.jdk;

import java.util.Observable;

public class NewspaperOffice {

	public Observable observable;

	public String things;

	public Observable getObservable() {
		return observable;
	}

	public void setObservable(Observable observable) {
		this.observable = observable;
	}

	public String getThings() {
		return things;
	}

	public void setThings(String things) {
		this.things = things;
	}

}
