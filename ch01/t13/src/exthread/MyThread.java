package exthread;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
			if (Thread.interrupted()) {
				System.out.println("已经是停止状态了!我要退出了!");
				break;//仅仅跳出了for循环
			}
			System.out.println("i=" + (i + 1));
		}
	}
}
