package currentThreadTest;

public class currentThreadTest {
	public static void main(String [] args) {
		System.out.println("main���������̣߳�"+Thread.currentThread().getName());
		MyThread myThread = new MyThread("myThread");
		myThread.start();	//����start�����������µ��̣߳����µ��߳���ִ��run�����д���
		//myThread.run();	//ֱ�ӵ���run�����൱����ͨ�ĺ������ã�����ԭ�߳���ִ�д���
	}

}


class MyThread extends Thread {
	public MyThread(String threadNme) {
		super(threadNme);
		System.out.println("MyThread constructor�����̣߳�"+Thread.currentThread().getName());
	}
	@Override
	public void run() {
		System.out.println("run���������̣߳�"+Thread.currentThread().getName());
	}
}