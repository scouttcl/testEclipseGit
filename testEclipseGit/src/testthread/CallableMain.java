package testthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 
 * @author echutin
 *
 */
public class CallableMain {

	public static void main(String[] args) {
		Callable<Integer> call = new MyCallable();
		FutureTask<Integer> ft = new FutureTask<Integer>(call);
		
		for(int i = 0;i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			if(i == 20 || i == 40) {
				System.out.println("i:" + i);
				Thread t = new Thread(ft);
				t.start();
			}
		}
		
		System.out.println("For-loop in main thread is completed.");
		
		try {
			int sum = 0;
			sum = ft.get();
			System.out.println("sum = " + sum);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
