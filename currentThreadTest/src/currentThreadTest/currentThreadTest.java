package currentThreadTest;

public class currentThreadTest {
	public static void main(String [] args) {
		System.out.println("main方法所在线程："+Thread.currentThread().getName());
		MyThread myThread = new MyThread("myThread");
		myThread.start();	//调用start方法会启动新的线程，在新的线程中执行run方法中代码
		//myThread.run();	//直接调用run方法相当于普通的函数调用，仍在原线程中执行代码
	}

}


class MyThread extends Thread {
	public MyThread(String threadNme) {
		super(threadNme);
		System.out.println("MyThread constructor所在线程："+Thread.currentThread().getName());
	}
	@Override
	public void run() {
		System.out.println("run方法所在线程："+Thread.currentThread().getName());
	}
}