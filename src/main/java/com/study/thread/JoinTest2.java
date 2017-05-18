package com.study.thread;

public class JoinTest2 {

	// 1.������T1��T2��T3�����̣߳���������֤T2��T1ִ�����ִ�У�T3��T2ִ�����ִ��

	public static void main(String[] args) {

		final Thread t1 = new Thread(new Runnable() {

			@Override
            public void run() {
				System.out.println("t1");
			}
		});
		final Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					// ����t1�̣߳��ȴ�t1�߳�ִ����
					t1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("t2");
			}
		});
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					// ����t2�̣߳��ȴ�t2�߳�ִ����
					t2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("t3");
			}
		});
		t3.start();//���������̵߳�����˳��������⣬��ҿ������£�
		t2.start();
		t1.start();
	}
}