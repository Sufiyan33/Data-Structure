package test_knowledge;

public class MyThread extends Thread {

	Thread t1;
	Thread t2;

	public MyThread() {
		t1 = new Thread(this, "Thread_1");
		t2 = new Thread(this, "Thread_2");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.equals(t2));
	}
}
