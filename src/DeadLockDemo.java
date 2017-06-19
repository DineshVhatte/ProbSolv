
public class DeadLockDemo {
	
	class SyncPrinter implements Runnable {
		
		SharedResource saredresource;
		
		public SyncPrinter(SharedResource saredresource) {
			this.saredresource = saredresource;
		}

		@Override
		public void run() {

			synchronized(saredresource) {
				try {
					System.out.println("Inside the lock1");
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (saredresource) {
					
					System.out.println("Inside the lock2");
					
				}
			}
			
		}
		
	}
	
	
	
	public static void main(String [] args) {
		
		DeadLockDemo deadLockDemo = new DeadLockDemo();
		
		Thread thread1 = new Thread(deadLockDemo.new SyncPrinter(new SharedResource()));
		Thread thread2 = new Thread(deadLockDemo.new SyncPrinter(new SharedResource()));
		thread1.run();
		thread2.run();
	}

}
class SharedResource {
	
}