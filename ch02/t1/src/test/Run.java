package test;

import service.HasSelfPrivateNum;
import extthread.ThreadA;
import extthread.ThreadB;

public class Run {

	public static void main(String[] args) {

		HasSelfPrivateNum numRef = new HasSelfPrivateNum();//ʵ����һ������

		ThreadA athread = new ThreadA(numRef);//ʵ����ThreadA����
		athread.start();//����

		ThreadB bthread = new ThreadB(numRef);//ʵ����ThreadB����
		bthread.start();//����

	}

}
