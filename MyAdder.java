package 복학1;

public class MyAdder {
	private int sum;
	
	public void add(int m,int n) {
		
		for (int i=0; i <= n-m; i++) {
			sum += m+i;
			
		}
		
	}
	int getValue() {
		return sum;
	}

}
