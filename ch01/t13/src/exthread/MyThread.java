package exthread;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
			if (Thread.interrupted()) {
				System.out.println("�Ѿ���ֹͣ״̬��!��Ҫ�˳���!");
				break;//����������forѭ��
			}
			System.out.println("i=" + (i + 1));
		}
	}
}
