package test;

import exthread.MyThread;


public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();//ʵ����һ���µ��߳�MyThread
			thread.start();//�����µ��߳�ִ��
			Thread.sleep(2000);//���߳�����2000ms
			thread.interrupt();//���Զ�����̴߳���һ��ֹͣ���жϱ�ǣ�����δ����ֹͣ�߳�
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}
