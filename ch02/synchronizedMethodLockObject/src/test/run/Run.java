package test.run;

import extobject.MyObject;
import extthread.ThreadA;
import extthread.ThreadB;

public class Run {

	public static void main(String[] args) {
		MyObject object = new MyObject();//实例化对象
		ThreadA a = new ThreadA(object);
		a.setName("A");
		ThreadB b = new ThreadB(object);
		b.setName("B");

		a.start();
		b.start();
	}

}
