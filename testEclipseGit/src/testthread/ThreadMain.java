package testthread;


public class ThreadMain {

	public static void main(String[] args) {
//		Thread1 t1 = new Thread1("T1");
//		Thread1 t2 = new Thread1("T2");
//		t1.start();
//		t2.start();
//		
//		Thread th1 = new Thread(new Thread2("R1"));
//		Thread th2 = new Thread(new Thread2("R2"));
//		th1.start();
//		th2.start();
		
		Thread t3 = new Thread1(new Thread2("R3"));
		t3.start();
	}

}
