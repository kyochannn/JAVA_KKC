package 연습장;

public class PushUp {
	int pushUp;
	int pullUp;
	int run;
	
	public PushUp() {
		this(80,20,10);
	}
	
	public PushUp(int pushUp, int pullUp, int run) {
		this.pushUp = pushUp;
		this.pullUp = pullUp;
		this.run = run;
	}
	
	public static void count() {
		
		for (int i=1; i<11;i++) {
			System.out.println(i + "개 했습니다.");
			
		}
	}
}
