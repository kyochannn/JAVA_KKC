package Day8.Ex04_Interface;

// 인터페이스 구현 키워드 : implements
public class Television implements Remotecontrol {

	// 변수
	private int volume;   //음량
	
	@Override
	public void turnOn() {
		System.out.println("tv전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨을 최댓값이 넘지 못하게 지정
		if (volume > Remotecontrol.MAX_VOLUME) {
			this.volume = Remotecontrol.MAX_VOLUME;
		} 
		else if (volume < Remotecontrol.MIN_VOLUME) {
			this.volume = Remotecontrol.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 tv 볼룜 : " + this.volume);
		
	}
	
}
