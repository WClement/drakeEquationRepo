package model;

public class TimedExecutor implements Runnable {
	
	Thread t;
	String threadName = "TimerThread";
	
	Model myGame;
	
	public TimedExecutor(Model myGame) {
		this.myGame = myGame;
	}

	public void start() {
		System.out.println("Starting TimedExecutor");
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	public void run() {
		gameLoop();
	}
	
	public void gameLoop() {
		long lastLoopTime = System.nanoTime();
		final int TARGET_FPS = 60;
		final long OPTIMAL_TIME = 1000000000 / TARGET_FPS;
	
		while (true) {
			
			long now = System.nanoTime();
			long updateLength = now - lastLoopTime;
			lastLoopTime = now;
			double delta = updateLength / ((double)OPTIMAL_TIME);
			
			doGameUpdates(delta);

			
			try {
				long temp = (lastLoopTime-System.nanoTime() + OPTIMAL_TIME)/1000000;
				if (temp < 0)
					temp = 0;
				Thread.sleep(temp);
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	private void doGameUpdates(double delta) {
		myGame.manageManagers();
	}
}
