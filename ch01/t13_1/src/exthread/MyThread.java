package exthread;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 500000; i++) {
				if (Thread.interrupted()) {
					System.out.println("�Ѿ���ֹͣ״̬��!��Ҫ�˳���!");
					throw new InterruptedException();//�׳��쳣
				}
				System.out.println("i=" + (i + 1));
			}
			System.out.println("����for����");
		} catch (InterruptedException e) {
			System.out.println("��MyThread.java��run�����е�catch�ˣ�");
			e.printStackTrace();
		}
	}
}
