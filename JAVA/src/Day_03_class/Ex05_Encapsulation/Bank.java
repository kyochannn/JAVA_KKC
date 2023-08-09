package Day_03_class.Ex05_Encapsulation;

public class Bank {
	public static void main(String[] args) {
		Encapsulation ec =
				new Encopsulation(0, "국민은행","282401-04-109955", "한성호");
				
		// ec.depisit = 100000;
		ec.setDeposit(10000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("계좌 잔액 : " + money);
	}
}
