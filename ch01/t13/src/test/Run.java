package test;

import exthread.MyThread;


public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();//实例化一个新的线程MyThread
			thread.start();//启动新的线程执行
			Thread.sleep(2000);//主线程休眠2000ms
			thread.interrupt();//给自定义的线程打上一个停止的中断标记，但并未真正停止线程
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}
