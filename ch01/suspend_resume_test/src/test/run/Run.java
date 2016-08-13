package test.run;

import mythread.MyThread;

public class Run {

	public static void main(String[] args) {

		try {
			MyThread thread = new MyThread();//实例化一个新线程
			thread.start();//启动线程
			Thread.sleep(5000);//main thread 休眠，转去执行新线程
			// A
			thread.suspend();//暂定新线程
			System.out.println("A= " + System.currentTimeMillis() + " i="
					+ thread.getI());
			Thread.sleep(5000);//main thread 休眠，新线程也处于暂停状态
			System.out.println("A= " + System.currentTimeMillis() + " i="
					+ thread.getI());
			// B
			thread.resume();//回复新线程运行
			Thread.sleep(5000);//main thread 休眠

			// C
			thread.suspend();//暂定新线程
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
