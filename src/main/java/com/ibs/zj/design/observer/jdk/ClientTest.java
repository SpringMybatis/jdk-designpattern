package com.ibs.zj.design.observer.jdk;

public class ClientTest {

	public static void main(String[] args) {
		SpecialRepoter repoter = new SpecialRepoter();
		GlobalTimes n1 = new GlobalTimes(repoter);
		PeopleDaily n2 = new PeopleDaily(repoter);
		XinhuaDaily n3 = new XinhuaDaily(repoter);
		repoter.getNewNewz("hello");
		n1.remove();
		n2.remove();
		n3.remove();
		repoter.getNewNewz("remove");
	}

}
