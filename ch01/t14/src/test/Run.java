package test;

import exthread.MyThread;

public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();//ʵ����һ���µ��߳�
			thread.start();//�����µ��߳�
			Thread.sleep(200);//main thread����200ms
			thread.interrupt();//�ж�thread
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}
