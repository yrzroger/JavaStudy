package test;

import exthread.MyThread;


public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();//�������߳�
			Thread.sleep(1000);//���߳�����1000ms
			thread.interrupt();
			//Thread.currentThread().interrupt();
			System.out.println("�Ƿ�ֹͣ1��="+Thread.interrupted());//�жϵ�ǰ�߳�(main)�Ƿ��ж�--false
			System.out.println("�Ƿ�ֹͣ2��="+Thread.interrupted());//�жϵ�ǰ�߳�(main)�Ƿ��ж�--false
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}

