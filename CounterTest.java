package 복학1;

public class CounterTest {
	
	public static void main(String args[]) {	
	Counter c1 = new Counter();
	Counter c2 = new Counter();
	
	c1.tick100();
	c2.tick1000();
	
	System.out.println(c1.getCount());
	System.out.println(c2.getCount());
	
	}


}
