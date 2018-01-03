package testthread;

/**
 * @author echutin
 *
 */
public class Thread2 implements Runnable {

	private String name;

	public Thread2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0;i < 5;i++) {
			System.out.println(Thread.currentThread().getName() + "running:" + this.name + "_" + i);
		}
	}
}
