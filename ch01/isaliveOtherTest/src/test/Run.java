package test;

import mythread.CountOperate;

public class Run {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();	//ʵ����һ��CountOperate����
		Thread t1 = new Thread(c);	//��runnable������Ϊ�������ݸ�Thread����
		System.out.println("main begin t1 isAlive=" + t1.isAlive());
		t1.setName("A");
		t1.start();
		/**
		 *  ����start()�����������µ��߳�A,�Զ�ִ��run()�����еĴ��룬�ڴ˴�ִ�е���CountOperate c�е�run
		 */
		System.out.println("main end t1 isAlive=" + t1.isAlive());
	}

}
