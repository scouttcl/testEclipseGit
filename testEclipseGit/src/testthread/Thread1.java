package testthread;

public class Thread1 extends Thread{

	private String name;
	
	public Thread1(String name) {
		this.name = name;
	}
	
	public Thread1(Runnable runnable) {
		super(runnable);
	}
	
	public Thread1(Runnable runnable, String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0;i < 5;i++) {
			System.out.println(Thread.currentThread().getName() + " running:" + this.name + "_" + i);
		}
		System.out.println();
	}
	
	
	
}
