package test;

import exthread.MyThread;

public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();//实例化一个新的线程
			thread.start();//启动新的线程
			Thread.sleep(200);//main thread休眠200ms
			thread.interrupt();//中断thread
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}
