package Day_09.Ex05_UserExcaption;

//사용자 정의 예외 클래스
//: public class ??Exception extends Excetpion { }
public class BalanceExcaption extends Exception {

	public BalanceExcaption() {
		super();
	}

	public BalanceExcaption(String message) {
		super(message);
	}

}
