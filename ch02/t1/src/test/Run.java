package test;

import service.HasSelfPrivateNum;
import extthread.ThreadA;
import extthread.ThreadB;

public class Run {

	public static void main(String[] args) {

		HasSelfPrivateNum numRef = new HasSelfPrivateNum();//实例化一个对象

		ThreadA athread = new ThreadA(numRef);//实例化ThreadA对象
		athread.start();//启动

		ThreadB bthread = new ThreadB(numRef);//实例化ThreadB对象
		bthread.start();//启动

	}

}
