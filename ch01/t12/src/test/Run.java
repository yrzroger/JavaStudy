package test;

import exthread.MyThread;


public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();//启动新线程
			Thread.sleep(1000);//主线程休眠1000ms
			thread.interrupt();
			//Thread.currentThread().interrupt();
			System.out.println("是否停止1？="+Thread.interrupted());//判断当前线程(main)是否中断--false
			System.out.println("是否停止2？="+Thread.interrupted());//判断当前线程(main)是否中断--false
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}

