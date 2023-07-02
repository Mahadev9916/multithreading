package com.trinity;

public class ThreadMain  implements Runnable {
	public static void main(String[] args) {
		
		System.out.println("thread running in main : "+Thread.currentThread().getName());
		ThreadMain thr=new ThreadMain();
		Thread t1=new Thread(thr);
		t1.start();
	//	System.out.println(t1);
	}

	@Override
	public void run() {
		System.out.println("thread running  : "+Thread.currentThread().getName());

	}

}
