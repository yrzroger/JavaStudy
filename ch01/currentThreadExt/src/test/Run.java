package test;

import mythread.CountOperate;

public class Run {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();	//��main thread�е���CountOperate��constructor
		Thread t1 = new Thread(c);
		/**
		 * ����Thread�Ĺ�������public Thread(Runnable runnable)
		 * ��Thread������һ��ʵ����Runnable target;
		 * �����ⲿ����һ��Runnable����ʱ��target��ָ���˸ö��� this.target = runnable;
		 * ����start������ִ��run�����Ĵ���
		 *     public void run() {
                  if (target != null) {
                     target.run();
                  }
               }
         * ��target��=nullʱ����תȥִ���ⲿ�����runnable�����run����
		 */
		t1.setName("A");
		t1.start();
	}

}
