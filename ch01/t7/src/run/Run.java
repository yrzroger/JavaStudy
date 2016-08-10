package run;	//包名

import mythread.MyThread;

public class Run {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();	//实例化一个MyThread对象
		System.out.println("begin ==" + mythread.isAlive());
		mythread.start();//启动新线程
		System.out.println("end ==" + mythread.isAlive());
	}
}
