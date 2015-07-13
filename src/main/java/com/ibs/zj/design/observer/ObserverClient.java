package com.ibs.zj.design.observer;

public class ObserverClient {

	public static void main(String[] args) {
		// 目标对象
		ConcreteSubject subject = new ConcreteSubject();
		// 更新消息
		subject.setStates("上海股票点数暴跌");
		// 观察者1
		ConcreteObserver observer1 = new ConcreteObserver();
		observer1.setObserverName("刘军");
		observer1.setObserverSay("都怪肖钢逗比，救你妹的，还救市");
		// 观察者2
		ConcreteObserver observer2 = new ConcreteObserver();
		observer2.setObserverName("肖盼");
		observer2.setObserverSay("赶紧补仓，发个小财");
		// 加入观察者
		subject.attachObserver(observer1);
		subject.attachObserver(observer2);
		// 更新
		subject.changeStates();
	}

}
