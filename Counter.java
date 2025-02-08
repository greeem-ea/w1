package 복학1;

public class Counter {
	
	private int count;
	
	void tick() {
		
		count++;
		}
	
	void tick100() {
		for(int i= 0; i<100; i++) {
			tick();
		}
		
	}
	void tick1000() {
		for(int i= 0; i<1000; i++) {
			tick();
		}
		
	}
	
	public int getCount() {
		return count;
	}

}
