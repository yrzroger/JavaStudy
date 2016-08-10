package test;

import mythread.CountOperate;

public class Run {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();	//实例化一个CountOperate对象
		Thread t1 = new Thread(c);	//将runnable对象作为参数传递给Thread对象
		System.out.println("main begin t1 isAlive=" + t1.isAlive());
		t1.setName("A");
		t1.start();
		/**
		 *  调用start()方法后启动新的线程A,自动执行run()方法中的代码，在此处执行的是CountOperate c中的run
		 */
		System.out.println("main end t1 isAlive=" + t1.isAlive());
	}

}
