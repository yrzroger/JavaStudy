package test.run;

import mythread.MyThread;

public class Run {

	public static void main(String[] args) {

		try {
			MyThread thread = new MyThread();//ʵ����һ�����߳�
			thread.start();//�����߳�
			Thread.sleep(5000);//main thread ���ߣ�תȥִ�����߳�
			// A
			thread.suspend();//�ݶ����߳�
			System.out.println("A= " + System.currentTimeMillis() + " i="
					+ thread.getI());
			Thread.sleep(5000);//main thread ���ߣ����߳�Ҳ������ͣ״̬
			System.out.println("A= " + System.currentTimeMillis() + " i="
					+ thread.getI());
			// B
			thread.resume();//�ظ����߳�����
			Thread.sleep(5000);//main thread ����

			// C
			thread.suspend();//�ݶ����߳�
			System.out.println("B= " + System.currentTimeMillis() + " i="
					+ thread.getI());
			Thread.sleep(5000);
			System.out.println("B= " + System.currentTimeMillis() + " i="
					+ thread.getI());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
