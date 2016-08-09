package test;

import mythread.CountOperate;

public class Run {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();	//在main thread中调用CountOperate的constructor
		Thread t1 = new Thread(c);
		/**
		 * 利用Thread的构造器：public Thread(Runnable runnable)
		 * 在Thread类中有一个实例域：Runnable target;
		 * 当从外部传入一个Runnable对象时，target便指向了该对象 this.target = runnable;
		 * 调用start方法后，执行run方法的代码
		 *     public void run() {
                  if (target != null) {
                     target.run();
                  }
               }
         * 当target！=null时，便转去执行外部传入的runnable对象的run方法
		 */
		t1.setName("A");
		t1.start();
	}

}
