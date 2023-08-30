import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GoRunnable implements Runnable{

	private final long countUntil;
	public GoRunnable(long countUntil) {
		// TODO Auto-generated constructor stub
		this.countUntil = countUntil;
	}
	public void run() {
		long sum=0;
		for(long i =1;i<countUntil;i++)sum+=i;
		System.out.println(sum);
		
	}
	
	
}                                                       

public class ExecutorDemo {
	private static final int NTHREDS = 100;
	public static void main(String[] args) {
//		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS); //105ms
//		ExecutorService executor = Executors.newSingleThreadExecutor(); //150ms
		ExecutorService executor = Executors.newCachedThreadPool(); //115ms 
		long stime = System.currentTimeMillis();
		for(int i =0;i<500;i++) {
			Runnable worker = new GoRunnable(1000000L+i);
			executor.execute(worker);
		}
		
		//This will make the executor accept no new threads 
		// and finish all the existing threads in the queue
		executor.shutdown();
		//
		while(!executor.isTerminated()) {
			
		}
		long ftime = System.currentTimeMillis();
		System.out.println("Finished all Threads!");
		System.out.println(ftime-stime);
	}

}
