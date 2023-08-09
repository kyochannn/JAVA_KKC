package Day_09.Ex05_UserExcaption;

public class Account {

	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceExcaption {
		if (balance < money) {
			// 잔고 < 출금액 : 출금할 수 없음
			if (balance < money) {
				// 예외 강제 발생
				throw new BalanceExcaption("잔고가 부족합니다." + (money-balance)+"원이 부족합니다.")
			}
			balance -= money;
		}
	}
}
